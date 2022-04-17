class Solution {
    public int maximumScore(int[] scores, int[][] edges) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<scores.length;i++){
            arr.add(new ArrayList<>()); }
        
        for(int a[]:edges){
            arr.get(a[0]).add(a[1]);
            arr.get(a[1]).add(a[0]);
        }
        for(ArrayList<Integer> a:arr)
            Collections.sort(a,new Comparator<Integer>(){
                public int compare(Integer a, Integer b){
            return scores[b]-scores[a];
    }
            });
              int ans=-1;               
          for(int i=0;i<edges.length;i++){
              int x=edges[i][0];
              int y=edges[i][1];
              for(int j=0;j<Math.min(3,arr.get(x).size());j++){
                  int a=arr.get(x).get(j);
                  if(a==y) continue;
                  for(int k=0;k<Math.min(3,arr.get(y).size());k++){
                      int b=arr.get(y).get(k);
                      if(b==x || b==a) continue;
                      
                      ans=Math.max(ans,scores[x]+scores[y]+scores[a]+scores[b]);
                  }
                  
              }
          }                   return ans;} }