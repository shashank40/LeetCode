class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int k=0;
        int ans[]=new int[n];
        while(k<n){
            if(nums[k]%2==0)
                ans[i++]=nums[k];
            else
                ans[j--]=nums[k];
            
            k++;
        }
        
        return ans;
    }
}