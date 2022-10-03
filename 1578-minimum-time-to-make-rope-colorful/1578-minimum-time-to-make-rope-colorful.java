class Solution {
    public int minCost(String colors, int[] needT) {
        char col[]=colors.toCharArray();
        int curr=0;
        int sum=0;
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<col.length;i++){
            if(i==0 || col[i]==col[i-1]){
                curr++;
                sum+=needT[i];
                max=Math.max(max,needT[i]);
            }
            else{
                if(curr>1){
                    ans+=(sum-max);
                }
                curr=1;
                sum=needT[i];
                max=needT[i];
            }
        }
        
         if(curr>1){
                    ans+=(sum-max);
                }
        
        return ans;
    }
}