class Solution {
    public int lastStoneWeight(int[] st) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:st)
            pq.add(a);
        
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(a!=b)
                pq.add(a-b);
        }
        
        if(pq.size()==0)
            return 0;
        
        return pq.peek();
    }
}