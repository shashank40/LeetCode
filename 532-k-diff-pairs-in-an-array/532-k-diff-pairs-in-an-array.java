class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> s=new HashSet<>();
        HashSet<Integer> all=new HashSet<>();
        int n=nums.length;
        int count=0;
        
        
        for(int i=0;i<n;i++){
                if(all.contains(nums[i]+k)&&!(s.contains(2*nums[i]+k))){
                    count++;
                    s.add(2*nums[i]+k);
                }
            if(all.contains(nums[i]-k)&&!(s.contains(2*nums[i]-k))){
                    count++;
                    s.add(2*nums[i]-k);
                }
            all.add(nums[i]);
            }
        
        return count;
    }
}