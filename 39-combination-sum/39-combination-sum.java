class Solution {
   List<List<Integer>> arr;
    ArrayList<Integer> temp;
    public List<List<Integer>> combinationSum(int[] c, int t) {
        arr=new ArrayList<>();
        temp=new ArrayList<>();
        
        answer(c,t,0);
        
        return arr;
    }
    
    public void answer(int[] c, int t, int i){
        if(i==c.length)
            return;
        
        if(t==0){
            arr.add(new ArrayList<>());
            for(int a:temp)
                arr.get(arr.size()-1).add(a);
            
            return;
        }
        
        if(c[i]<=t)
        {
            temp.add(c[i]);
            answer(c,t-c[i],i);
            temp.remove(temp.size()-1);
        }
        answer(c,t,i+1);
    }
}