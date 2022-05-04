class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int count=0;
        int n=nums.length;
       for(int i=0;i<n;i++){
           if(mp.containsKey(k-nums[i])){
               count++;
               if(mp.get(k-nums[i])==1)
                   mp.remove(k-nums[i]);
               else{
                   mp.put(k-nums[i],mp.get(k-nums[i])-1);
               }
           }
           else
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
       }
        
        return count;
    }
}


