class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int curr=nums[i];
            
            while(curr>0 && curr<=n && nums[curr-1]!=curr){
                int tmp=nums[curr-1];
                nums[curr-1]=curr;
                curr=tmp;
            }
        }
        
        for(int i=0;i<n;i++)
            if(nums[i]!=i+1)
                return i+1;
        
        return n+1;
    }
}