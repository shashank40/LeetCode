class Solution {
    Integer t[][];
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        
        for(int num:nums)
            sum+=num;
        
        if(!(sum%2==0))
            return false;
        
        sum=sum/2;
        t=new Integer[n][sum+1];
        
        return calc(nums,0,sum);
    }
    
    public boolean calc(int arr[], int i, int sum){
        if(sum==0)
            return true;
        
        if(i==arr.length)
            return false;
        
        if(t[i][sum]!=null)
            return (t[i][sum]==(Integer)0)?false:true;
        boolean ans=calc(arr,i+1,sum);
        if(arr[i]<=sum)
            {   ans=ans|calc(arr,i+1,sum-arr[i]);
            }
        if(ans==false)
                    t[i][sum]=(Integer)0;
                else
                    t[i][sum]=(Integer)1;
             
             return ans;
        
    }
}