class Solution {
    long m=1000000007;
    public int maxPerformance(int n, int[] speed, int[] ef, int k) {
        pair p[]=new pair[n];
        for(int i =0 ;i<n;i++){
            p[i]=new pair(speed[i],ef[i]);
        }
        
        Arrays.sort(p);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long sum=0;
        long ans=0;
        for(int i=n-1;i>=0;i--){
        ans=Math.max((sum+p[i].s)*p[i].e,ans);
        if(pq.size()<k-1)
        {
            pq.add(p[i].s);
            sum+=p[i].s;
        }
        else{
            if(pq.size()>0 && pq.peek()<p[i].s){
                sum-=pq.poll();
                sum+=p[i].s;
                pq.add(p[i].s);
            }
        }
            
        }
        
        return (int)(ans % m);
    }
}
class pair implements Comparable<pair>{
    int s;
    int e;
    
    pair(int s, int e){
        this.s=s;
        this.e=e;
    }
    
    public int compareTo(pair p){
        return this.e-p.e;
    }
}
