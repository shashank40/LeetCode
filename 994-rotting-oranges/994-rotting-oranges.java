class Solution {
    public int orangesRotting(int[][] grid) {
        int Nrott=0; /// not rotten oranges count;
        int m=grid.length;
        int n=grid[0].length;
        int time=0; /// to calculate time
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    Nrott++;
                else if(grid[i][j]==2){
                    q.add(new pair(i,j));
                }
            }
        }
        if(Nrott==0)
            return 0;
        
        while(!q.isEmpty()){
            int curr=q.size(); ///count of oranges in current iteration
            /// after they are over time increases
            
            for(int i=0;i<curr;i++){
                int idx1=q.peek().i;
                int idx2=q.peek().j;
                
                q.poll();
                
                if(idx1-1 >=0 && grid[idx1-1][idx2]==1){
                    q.add(new pair(idx1-1,idx2));
                    grid[idx1-1][idx2]=2;
                    Nrott--;
                }
                if(idx1+1 <m && grid[idx1+1][idx2]==1){
                    q.add(new pair(idx1+1,idx2));
                    grid[idx1+1][idx2]=2;
                    Nrott--;
                }
                if(idx2-1 >=0 && grid[idx1][idx2-1]==1){
                    q.add(new pair(idx1,idx2-1));
                    grid[idx1][idx2-1]=2;
                    Nrott--;
                }
                if(idx2+1 <n && grid[idx1][idx2+1]==1){
                    q.add(new pair(idx1,idx2+1));
                    grid[idx1][idx2+1]=2;
                    Nrott--;
                }
            }
            
            time++;
            
        }
        
        if(Nrott==0)
            return time-1;
        
        return -1;
        
    }
    
    class pair {
        int i;
        int j;
        
        pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
}