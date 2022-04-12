class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                int cnt=count(board,i,j,m,n);
                if(board[i][j]==0){
                    if(cnt==3)
                        board[i][j]+=2;
                }
                else{
                    if(cnt==2 || cnt==3)
                        board[i][j]+=2;
                }
            }
        }
            
            for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                if(board[i][j]>=2)
                    board[i][j]=1;
                else
                    board[i][j]=0;
               
            }
            
        }
    }
    
    public int count(int arr[][],int i, int j,int m, int n){
        int count=0;
        if(i>0 && (arr[i-1][j]==1||arr[i-1][j]-2==1))
            count++;
        if(j>0 && (arr[i][j-1]==1 || arr[i][j-1]-2==1))
            count++;
        if(i<m-1 && (arr[i+1][j]==1 || arr[i+1][j]-2==1))
            count++;
        if(j<n-1 && (arr[i][j+1]==1 ||arr[i][j+1]-2==1 ))
            count++;
        if((i>0 && j>0) && (arr[i-1][j-1]==1||arr[i-1][j-1]-2==1))
            count++;
        if((i<m-1 && j<n-1) && (arr[i+1][j+1]==1 ||arr[i+1][j+1]-2==1))
            count++;
        if((i>0 && j<n-1) && (arr[i-1][j+1]==1 || arr[i-1][j+1]-2==1))
            count++;
        if((i<m-1 && j>0) && (arr[i+1][j-1]==1||arr[i+1][j-1]-2==1))
            count++;
        
        return count;
    }
}