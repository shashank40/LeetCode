class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        int curr=0;
        while(i<n){
            if(i<n-1 && nums[i]==nums[i+1]){
                nums[curr++]=nums[i];
                nums[curr++]=nums[i];
                while(i<n && nums[i]==nums[curr-1])
                    i++;
            }
            else{
               nums[curr++]=nums[i];
                i++;
            }
        }
        
        return curr;
    }
}