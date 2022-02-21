class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int curr=nums[0];
        int n=nums.length;
        
        for(int i=1;i<n;i++){
            if(nums[i]==curr)
                count++;
            else
            {
                count--;
            }
            if(count==0){
                count=1;
                curr=nums[i];
            }
        }
        
        return curr;
    }
}