class Solution {
    public void setZeroes(int[][] a) {

        int m=a.length;
        int n=a[0].length;
        int r=1,c=1;
        int p=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(a[i][j]==0){
                    if(p==-1){
                    if(i==0) r=0;
                    if(j==0) c=0; 
                    if(r==0 && c==0)
                        p=0;
                    }
                a[0][j]=0;
                    a[i][0]=0;
            }
        }
        }
        
        for(int i=m-1;i>=r;i--){
            for(int j=n-1;j>=c;j--)
                if(a[0][j]==0 || a[i][0]==0)
                    a[i][j]=0;
        }
        
        
        
    }
}