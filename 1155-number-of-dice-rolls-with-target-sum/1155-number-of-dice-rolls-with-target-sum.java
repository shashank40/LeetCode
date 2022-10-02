class Solution {
    int m=1000000007;
    Integer t[][];
    public int numRollsToTarget(int n, int k, int target) {
        t=new Integer[30][1000];
        return value(1,n,k,target);
    }
    
    public int value(int i, int n, int k, int sum){
        if(i==n+1){
            if(sum==0)
                return 1;
            
            return 0;
        }
        
        if(t[i-1][sum-1]!=null)
            return t[i-1][sum-1];
        
        int ans=0;
        for(int j = 1 ; j <= k ; j++){
            if(sum-j >= n-i){
            ans+=value(i+1,n,k,sum-j);
            ans=ans%m; }
            else
                break;
        }
        
        return t[i-1][sum-1]=ans;
    }
    
}