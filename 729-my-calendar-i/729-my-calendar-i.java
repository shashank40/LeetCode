class MyCalendar {
ArrayList<Integer> arr;
    public MyCalendar() {
        arr=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
      if(arr.size()==0){
          arr.add(start);
          arr.add(end);
          return true;
      }
        else{
            int i=0;
            while(i<arr.size()){
                if(start<arr.get(i+1) && end>arr.get(i))
                    return false;
                else
                {
                    i+=2;
                }
            }
            arr.add(start);
            arr.add(end);
            return true;
        }
        
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */