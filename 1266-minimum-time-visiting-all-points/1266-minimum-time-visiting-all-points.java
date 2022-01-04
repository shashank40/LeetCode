class Solution {
    public int minTimeToVisitAllPoints(int[][] A) {
         int n=A.length;
            int ans=0;

            for(int i=1;i<n;i++){
                int x=Math.abs(A[i][0]-A[i-1][0]);
                int y=Math.abs(A[i][1]-A[i-1][1]);
                ans+=(Math.max(x,y));
            }

            return ans;
       
        
    }
}