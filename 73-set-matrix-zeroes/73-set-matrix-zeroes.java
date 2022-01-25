class Solution {
    public void setZeroes(int[][] a) {
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();

        int m=a.length;
        int n=a[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(a[i][j]==0){
                row.add(i);
                col.add(j);
            }
        }
        }

        for(int i:row)
        Arrays.fill(a[i],0);

        for(int j:col){
            for(int i=0;i<m;i++)
            a[i][j]=0;
        }
        
    }
}