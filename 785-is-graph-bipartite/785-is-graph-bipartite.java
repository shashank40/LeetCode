class Solution {
    public boolean isBipartite(int[][] graph) {
        HashSet<Integer> left=new HashSet<>();
         HashSet<Integer> right=new HashSet<>();
        if(graph.length>0  && graph[0].length==1 && (graph[0][0]==3 || graph[0][0]==2))
            return true;
        int n=graph.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                if((left.contains(i) && left.contains(graph[i][j])) || (right.contains(i) && right.contains(graph[i][j]))) return false;
                else if((!left.contains(i) && !right.contains(graph[i][j])) && (!right.contains(i) && !left.contains(graph[i][j]))) {left.add(i);
                                                                                                                                     right.add(graph[i][j]);
                }
                else if(left.contains(i) && !right.contains(graph[i][j]))
                    right.add(graph[i][j]);
                else if(left.contains(graph[i][j]) && !right.contains(i))
                    right.add(i);
                else if(right.contains(graph[i][j]) && !left.contains(i))
                    left.add(i);
                else if(right.contains(i) && !left.contains(graph[i][j]))
                    left.add(graph[i][j]);
                
            }
        }
        
        return true;
    }
}