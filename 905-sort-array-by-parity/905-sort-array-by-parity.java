class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int i=0;
        int n=nums.length;
        int j=n-1;
        int k=0;
        
        while(k<n){
            if((nums[k]%5001)%2==0){
                nums[i]+=((nums[k]%5001)*5001); 
            i++;}
            else{
                nums[j]+=((nums[k]%5001)*5001);
                j--;
                }
            k++;
        }
        
        for(i=0;i<n;i++)
               nums[i]=nums[i]/5001;
        
        return nums;
            
    }
}