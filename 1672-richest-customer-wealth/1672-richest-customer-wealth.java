class Solution {
    public int maximumWealth(int[][] acc) {
        int m=acc.length;
        int n=acc[0].length;
        int max=Integer.MIN_VALUE;
        int curr=0;
        
        for(int i=0;i<m;i++){
            curr=0;
            for(int j=0;j<n;j++)
                curr+=acc[i][j];
            
            max=Math.max(curr,max);
        }
        
        return max;
    }
}