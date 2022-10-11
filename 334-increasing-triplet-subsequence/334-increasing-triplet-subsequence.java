class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int right[]=new int[n];
        int max=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=max;
            max=Math.max(max,nums[i]);
        }
        
         max = nums[0]; // to save space , else i used int min before
        
        for(int i=1;i<n-1;i++){
            if(max<nums[i] && right[i]>nums[i])
                return true;
            
            max=Math.min(max,nums[i]);
        }
        
        return false;
    }
}