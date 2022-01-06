class Solution {
    public int maxAbsValExpr(int[] A, int[] A2) {
        int n=A.length;
        int m1=Integer.MIN_VALUE; //max a[i]+i+A2[i];
        int m2=Integer.MAX_VALUE; //min a[i]+i+A2[i];
        int m3=Integer.MIN_VALUE; //max a[i]+i-A2[i];
        int m4=Integer.MAX_VALUE; //min a[i]+i-A2[i];
        int m5=Integer.MIN_VALUE; //max a[i]-i+A2[i];
        int m6=Integer.MAX_VALUE; //min a[i]-i+A2[i];
        int m7=Integer.MIN_VALUE; //max a[i]-i-A2[i];
        int m8=Integer.MAX_VALUE; //min a[i]-i-A2[i];

        for(int i =0;i<n;i++){
            m1=Math.max(A[i]+i+A2[i],m1);
             m2=Math.min(A[i]+i+A2[i],m2);
              m3=Math.max(A[i]+i-A2[i],m3);
               m4=Math.min(A[i]+i-A2[i],m4);
            m5=Math.max(A[i]-i+A2[i],m5);
             m6=Math.min(A[i]-i+A2[i],m6);
              m7=Math.max(A[i]-i-A2[i],m7);
               m8=Math.min(A[i]-i-A2[i],m8);
        }

        return Math.max(Math.max(m1-m2,m3-m4),Math.max(m5-m6,m7-m8));
    }
}