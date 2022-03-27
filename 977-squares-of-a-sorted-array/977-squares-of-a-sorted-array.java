class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int val[]=new int[n];
        int i=0;
        int j=n-1;
        int k=n-1;
        while(i<=j){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                val[k--]=nums[j]*nums[j];
                j--;
            }
            else{
                val[k--]=nums[i]*nums[i];
                i++;
            }
        }
        
        return val;
    }
}