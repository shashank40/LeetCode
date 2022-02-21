class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;
        int count=0;
        
        for(int a:nums){
            sum+=a;
            int curr=sum%k;
            if(curr<0)
                curr+=k;
            
            if(mp.containsKey(curr))
                count+=mp.get(curr);
            
            mp.put(curr,mp.getOrDefault(curr,0)+1);
        }
        return count;
    }
}