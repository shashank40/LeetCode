class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int right[]=new int[n];
        int max=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=max;
            max=Math.max(max,nums[i]);
        }
        
        int min = nums[0];
        
        for(int i=1;i<n-1;i++){
            if(min<nums[i] && right[i]>nums[i])
                return true;
            
            min=Math.min(min,nums[i]);
        }
        
        return false;
    }
}