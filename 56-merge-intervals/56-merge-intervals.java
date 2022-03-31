class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,new cmp());
        int end=inter[0][1];
        int st=inter[0][0];
        
        int n=inter.length;
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(inter[i][0]>end){
                arr.add(new ArrayList<>());
                arr.get(arr.size()-1).add(st);
                arr.get(arr.size()-1).add(end);
                st=inter[i][0];
                end=inter[i][1];
            }
            else if(inter[i][0]<=end && end<inter[i][1])
                end=inter[i][1];
        }
        
        if(arr.size()==0 ||arr.get(arr.size()-1).get(1)<st)
        {
            arr.add(new ArrayList<>());
                arr.get(arr.size()-1).add(st);
                arr.get(arr.size()-1).add(end);
        }
        int ans[][]=new int[arr.size()][2];
        int i=0;
       for(List<Integer> ls : arr){
           ans[i][0]=ls.get(0);
           ans[i++][1]=ls.get(1);
       }
        
        return ans;
    }
}

class cmp implements Comparator<int[]>{
    public int compare(int[] a, int[] b){
        
        return a[0]-b[0];
    }
}