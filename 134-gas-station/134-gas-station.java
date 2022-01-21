class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int curr=0;
        for(int i=0;i<n;i++)
            curr+=(gas[i]-cost[i]);
        
        if(curr<0)
            return -1;
        
        curr=0;
        int st=0;
       for(int i=0;i<n;i++){
           curr+=(gas[i]-cost[i]);
           if(curr<0){
               curr=0;
               st=i+1;
           }
       }
        
        return st;
    }
}