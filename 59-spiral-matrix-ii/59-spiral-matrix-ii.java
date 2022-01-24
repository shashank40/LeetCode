class Solution {
    public int[][] generateMatrix(int A) {
        int n=1;
        int m[][]=new int[A][A];
        int i=0,j=0,k=A-1,l=A-1;
       while(i<=k && j<=l){
           for(int a=i;a<=k;a++){
               m[j][a]=n++;
           }
           j++;
           for(int a=j;a<=l;a++){
               m[a][k]=n++;
           }
           k--;
           for(int a=k;a>=i;a--){
               m[l][a]=n++;
           }
           l--;
           for(int a=l;a>=j;a--){
               m[a][i]=n++;
           }
            i++;
       }
                return m;
        
    }
}