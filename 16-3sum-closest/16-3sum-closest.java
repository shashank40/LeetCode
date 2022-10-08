class Solution {
    public int threeSumClosest(int[] nums, int target) {
    
        Arrays.sort(nums);
        int n=nums.length;
        int val=1000000;
        
        for(int i=0;i<n-2;i++){
            int x=i+1;
            int y=n-1;
            
            while(x<y){
                int curr=nums[i]+nums[x]+nums[y];
                if(curr==target) return curr;
                if(curr>target)
                {
                    y--;
                }
                else
                    x++;
                
                if(Math.abs(curr-target)<Math.abs(val-target))
                    val=curr;
            }
        }
        
        return val;
        
    }
}