class Solution {
    int val[];
    public int findDuplicate(int[] A) {
     val=new int[100000];
        int n=A.length;
        
        for(int i=0;i<n;i++){
            val[A[i]-1]++;
        }
        
        for(int i=0;i<100000;i++){
            if(val[i]>=2)
                return (i+1);
        }
        
        return -1;
        
    }
}