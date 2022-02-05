class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n;i++)
            if(nums[i]==0)
                nums[i]=-1;
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        int result=0;
        int prev=0;
        mp.put(0,-1);
        for(int i=0;i<n;i++){
            prev+=nums[i];
            
            if(mp.containsKey(prev))
                result=Math.max(i-mp.get(prev),result);
            else
                mp.put(prev,i);
        }
        
        return result;
    }
}