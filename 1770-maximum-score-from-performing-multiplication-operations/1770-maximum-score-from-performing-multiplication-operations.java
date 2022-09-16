class Solution {
    Integer t[][]=new Integer[1000][1000];
    public int maximumScore(int[] nums, int[] mul) {
        return value(0,0,nums,mul);
    }
    
    public int value(int x,int i, int nums[], int mul[]){
        if(i==mul.length)
            return 0;
        if(t[x][i]!=null)
            return t[x][i];
        int val = nums[x]*mul[i] + value(x+1,i+1,nums,mul);
        int val2= nums[nums.length-1-i+x]*mul[i] + value(x,i+1,nums,mul);
 
        return t[x][i]= Math.max(val,val2);
    }
}