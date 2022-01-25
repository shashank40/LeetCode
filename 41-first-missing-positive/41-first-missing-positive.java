class Solution {
    public int firstMissingPositive(int[] A) {
         int n=A.length;
        HashSet<Integer> s=new HashSet<>();
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(A[i]>0)
            s.add(A[i]);

            max=Math.max(max,A[i]);
        }

        if(max<=0)
        return 1;

        for(int i=1;i<=max;i++){
            if(!s.contains(i))
            return i;
        }

        return (max+1);
    }
}