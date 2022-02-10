class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum[]=new int[n];
        sum[0]=nums[0];
        for(int i=1;i<n;i++)
            sum[i]=sum[i-1]+nums[i];
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int count=0;
        for(int i=0;i<n;i++){
            if(mp.containsKey(sum[i]-k))
                count+=mp.get(sum[i]-k);
            
            mp.put(sum[i],mp.getOrDefault(sum[i],0)+1);
        }
        
        return count;
    }
}