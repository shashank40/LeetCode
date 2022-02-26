class Solution {
    public int shortestPathLength(int[][] graph) { /////// LEARNING : BFS DONE for SHORTEST PATH, BUT SOME DIFF, DIFF IS
        //// WE CAN VISIT NODE AGAIN, to check that we added current state ka bit mask with it ki wapas br br same state mei na jae.
        int n=graph.length;
            if(n==1)
                return 0;
        
        int max=(1<<n)-1;/////(bitmask ki all nodes are 1 or not, we want all 1 to be answer)
        int count=0;
        Queue<int []> q=new LinkedList<>();
        
        for(int i=0;i<n;i++)
            q.add(new int[]{i,1<<i}); //// we want to start from each node.
        //// this is how we add array as well as it values.
        
        int vis[][]=new int[n][max+1]; /// to check if a particular config has be reached before or not.
        while(!q.isEmpty()){
            int no=q.size();
            count++; /// here itself as from all nodes we go level down now, so 1 step.
            
    for(int i=0;i<no;i++) //// now looping everything that was present in queue, ki each part ko 1 level lower we are taking
            {
                int curr[]=q.poll();
                int node=curr[0];
                int currState=curr[1];
        
                for(int neigh:graph[node]){
                    /// now visiting all neighbours of current node(and going only that routes which have not be visited with current new config)
                    int newState=currState|(1<<neigh);
                    if(vis[neigh][newState]==1)
                        continue;// we wont add in queue;
                    if(newState==max)
                        return count;
                    vis[neigh][newState]=1;
                    q.add(new int[]{neigh,newState});
                }
                
            }
            
            }
        
        return -1;
        
    }
}



//////// yahin rather than count, i would have take int [3], jisme third is the value till now, and jaise hi newState==max
// return its distance vale at index[2] +1 as answer(as shown in second video of WAY 2);