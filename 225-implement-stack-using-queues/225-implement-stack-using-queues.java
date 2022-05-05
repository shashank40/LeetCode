class MyStack {
    int last;
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
        last=-1;
    }
    
    public void push(int x) {
        q.add(x);
        last=x;
    }
    
    public int pop() {
       int n=q.size();
        if(n==1)
        {
            last=-1;
            return q.poll();
        }
        
        for(int i=1;i<n;i++){
            if(i==n-1)
                last=q.peek();
            
            q.add(q.poll());
        }
        
        return q.poll();
    }
    
    public int top() {
        return last;
    }
    
    public boolean empty() {
        return (q.size()==0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */