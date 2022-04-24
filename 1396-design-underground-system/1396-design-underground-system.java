class UndergroundSystem {
    HashMap<Integer,String> st1;
    HashMap<Integer,Integer> st2;
    HashMap<String,Double> avg;
    HashMap<String,Double> count;
    public UndergroundSystem() {
        st1=new HashMap<>();
        st2=new HashMap<>();
        avg=new HashMap<>();
        count=new HashMap<>();
    }
    
    public void checkIn(int id, String stName, int t) {
        st1.put(id,stName);
        st2.put(id,t);
    }
    
    public void checkOut(int id, String stName, int t) {
        String n=st1.get(id)+"+" +stName;
        double time=(double)t-(double)st2.get(id);
        if(avg.containsKey(n)){
            avg.put(n,avg.get(n)+time);
            count.put(n,count.get(n)+1.0);
        }
        else{
            avg.put(n,time);
            count.put(n,1.0);
        }
        
        st1.remove(id);
        st2.remove(id);
    }
    
    public double getAverageTime(String ston, String enon) {
        
        return (avg.get(ston+"+"+enon)/count.get(ston+"+"+enon));
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */