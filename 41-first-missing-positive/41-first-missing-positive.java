class Solution {
    boolean val[];
    public int firstMissingPositive(int[] A) {
         int n=A.length;
       val=new boolean[500001];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            
                if(A[i]>0)
                    min=Math.min(min,A[i]);
            
            max=Math.max(max,A[i]);
        }

        if(max<=0 || min>1)
        return 1;
        
        for(int i=0;i<n;i++){
            if(A[i]>0 && (A[i]-min)<500001)
                val[A[i]-min]=true;
        }
        
        for(int i=0;i<500001;i++)
            if(val[i]==false)
                return (i+min);
        
        
        return (max+1);
        
    }
}