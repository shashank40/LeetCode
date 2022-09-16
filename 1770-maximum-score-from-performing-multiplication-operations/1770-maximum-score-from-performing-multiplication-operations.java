class Solution {
    Integer t[][]=new Integer[1000][1000];
    public int maximumScore(int[] nums, int[] mul) {
        return value(0,nums.length,0,nums,mul);
    }
    
    public int value(int x,int n,int i, int nums[], int mul[]){
        if(i==mul.length)
            return 0;
        if(t[x][i]!=null)
            return t[x][i];
 
        return t[x][i]= Math.max(nums[x]*mul[i] + value(x+1,n,i+1,nums,mul),
                                 nums[n-1-i+x]*mul[i] + value(x,n,i+1,nums,mul));
    }
}