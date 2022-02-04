class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n=nums1.length;
        int curr=0;
        HashMap<Integer,Integer> part1=new HashMap<>();
        HashMap<Integer,Integer> part2=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            part1.put(nums1[i]+nums2[j],part1.getOrDefault(nums1[i]+nums2[j],0)+1);
            part2.put(nums3[i]+nums4[j],part2.getOrDefault(nums3[i]+nums4[j],0)+1);
        }
        }
        int count=0;
        
        for(Map.Entry<Integer,Integer> e:part1.entrySet())
        {
            if(part2.containsKey(-1*e.getKey()))
                count+=(e.getValue()*part2.get(-1*e.getKey()));
        }
        
        return count;
    }
}