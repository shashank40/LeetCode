class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int m=queries.length;
        int ans[]=new int[m];
        int sum=0;
        int n=nums.length;
        
        for(int i=0;i<n;i++)
            if(nums[i]%2==0)
                sum+=nums[i];
        
        for(int i=0;i<m;i++){
            if((queries[i][0]+nums[queries[i][1]])%2!=0){
                if(nums[queries[i][1]] %2 ==0)
                    sum-=nums[queries[i][1]];
            }
            else
            {
                if(nums[queries[i][1]]%2==0)
                    sum+=queries[i][0];
                else
                    sum+=(queries[i][0]+nums[queries[i][1]]);
            }
            nums[queries[i][1]]+=queries[i][0];
            ans[i]=sum;
        }
        
        return ans;
        
    }
}