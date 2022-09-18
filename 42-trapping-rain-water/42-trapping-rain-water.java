class Solution {
    public int trap(int[] h) {
        int n=h.length;
        if(n<=2)
            return 0;
        
        Stack<Integer> s = new Stack<>();
        int curr=0;
        int max=h[0];
        int right[]=new int[n];
        int sum=0;
        
        s.add(h[n-1]);
        
        for(int i=n-2;i>0;i--){
            while(s.size()>0 && s.peek()<=h[i])
               s.pop();
            
            if(s.size()>0)
                right[i]=s.peek();
            else{
                s.add(h[i]);
                right[i]=h[i]; 
            }
            
            
        }
        
        for(int i=1;i<n-1;i++){
            curr=(Math.min(max,right[i]) - h[i]);
            if(curr>0)
                sum+=curr;
            max=Math.max(max,h[i]);
        }
        
        return sum;
    }
}