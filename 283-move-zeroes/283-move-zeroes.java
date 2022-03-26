class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length;
        int curr=0;
        for(;i<n;i++){
            if(nums[i]!=0){
                curr=nums[i];
                nums[i]=0;
                nums[j++]=curr;
            }
        }
        
    }
}