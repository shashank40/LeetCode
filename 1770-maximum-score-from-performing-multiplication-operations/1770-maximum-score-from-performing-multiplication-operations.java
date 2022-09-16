class Solution {
    
    
    // Dynamic programming solution with memory optimized
    public int maximumScore(int[] nums, int[] multipliers) {
        
        int n = nums.length;
        int m = multipliers.length;
        
        int right = n-1;
            
        int[] dp = new int[m+1]; 
        
        for(int index=m-1; index >= 0; index--){
            for(int left=0; left<=index; left++){
                right = (n-1)-(index-left);
                 dp[left] = Math.max(multipliers[index]*nums[left]+dp[left+1],
                              multipliers[index]*nums[right]+dp[left]);
        
            }
        }
        
        return dp[0];
    }
    
}