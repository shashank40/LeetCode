class Solution {
    public int maxScore(int[] A, int B) {
        int n=A.length;
        int sum=0;
        for(int i=0;i<n;i++){
                sum+=A[i];
        }

        if(n<=B)
        return sum;

        int wind=0;
        for(int i=0;i<n-B;i++)
        wind+=A[i];

        int ans=sum-wind;
        int var=sum-wind;

        for(int i=n-B;i<n;i++){
        var=var-A[i]+A[i-(n-B)];
        ans=Math.max(ans,var);
        }

        return ans;
        
    }
}