class Solution {
    public int totalHammingDistance(int[] nums) {
        int n=nums.length;
        int sum=0;
        int x=0;
        int y=0;
        for(int i=0;i<32;i++){
            x=0;
            y=0;
            for(int j=0;j<n;j++){
                if((nums[j]&(1<<i))>0)
                    x++;
                else
                    y++; }
            
            sum+=(x*y);
        }
        
        return sum;
    }
}