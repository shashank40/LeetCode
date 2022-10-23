class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]={-1,-1};
        int n=nums.length;
        HashSet<Integer> s = new HashSet<>();
        int curr=1;
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            if(s.contains(nums[i]))
            { ans[0]=nums[i];
             continue;
            }
            
            if(ans[1] ==-1 && curr!=nums[i])
            { ans[1]=curr; 
              curr+=2;
            }
            else
                 curr++;
            
           
            s.add(nums[i]);
            
        }
        
        if(ans[1]==-1)
            ans[1]=n;
        
        return ans;
}
}