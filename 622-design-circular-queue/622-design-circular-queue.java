class MyCircularQueue {
    int arr[];
    int size;
    int add;
    int rem;
    public MyCircularQueue(int k) {
        arr=new int[k];
        size=0;
        add=0;
        rem=0;
    }
    
    public boolean enQueue(int value) {
        if(size<arr.length){
            
            arr[add]=value;
            size++;
            add=(add+1)%arr.length;
            return true;
        }
        
        return false;
    }
    
    public boolean deQueue() {
        if(size>0){
            arr[rem]=-1;
            size--;
            rem=(rem+1)%arr.length;
            return true;
        }
        
        return false;
    }
    
    public int Front() {
        if(size>0)
            return arr[rem];
        
        return -1;
    }
    
    public int Rear() {
        if(size>0)
            return arr[(add-1+arr.length)%arr.length];
        
        return -1;
    }
    
    public boolean isEmpty() {
        return (size<=0);
    }
    
    public boolean isFull() {
        return (size==arr.length);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */