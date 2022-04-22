class MyHashMap {
    Integer val[];
    public MyHashMap() {
        val=new Integer[1000001];
    }
    
    public void put(int key, int value) {
        val[key]=value;
    }
    
    public int get(int key) {
        if(val[key]==null)
            return -1;
        
        return (int)val[key];
    }
    
    public void remove(int key) {
        val[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */