class Solution {
    public int maxSubArray(int[] nums) {
        int curr=-100000;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0; i<n;i++){
            if(nums[i]>curr+nums[i])
                curr=nums[i];
            else
                curr+=nums[i];
            
            ans=Math.max(ans,curr);
        }
        
        return ans;
    }
}