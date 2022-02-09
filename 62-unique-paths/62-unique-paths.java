class Solution {
    Integer t[][];
    public int uniquePaths(int A, int B) {
         t=new Integer[A][B];
        return value(0,0,A-1,B-1);
    }
    public int value(int i,int j, int a, int b){
        if(i==a && j==b)
        return 1;

        if(i>a || j>b)
        return 0;

        if(t[i][j]!=null)
        return (int)t[i][j];
        
        t[i][j]=(Integer)(value(i+1,j,a,b)+value(i,j+1,a,b));

        return (int)t[i][j];
    }
}