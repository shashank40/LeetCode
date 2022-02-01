class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            
            ans=Math.max(ans,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        if(ans<=0)
            return 0;
        
        return ans;
    }
}