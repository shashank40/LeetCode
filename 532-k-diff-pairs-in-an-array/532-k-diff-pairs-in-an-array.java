class Solution {
    public int findPairs(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        HashSet<Integer> s=new HashSet<>();
       int t=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    t=nums[i]+nums[j];
                if(s.contains(t))
                    continue;
                else{
                    s.add(t);
                    count++; 
                }
                    
                }
                
            }
        }
        
        return count;
    }
}