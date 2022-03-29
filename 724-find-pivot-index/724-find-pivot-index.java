class Solution {
    public int pivotIndex(int[] nums) {
        int curr=0;
        int sum=0;
        
        for(int a:nums)
            sum+=a;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(curr==(sum-curr-nums[i]))
                return i;
            
            curr+=nums[i];
        }
        
        return -1;
    }
}