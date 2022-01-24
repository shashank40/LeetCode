class Solution {
    List<Integer> ans=new ArrayList<>();
    
    public List<Integer> getRow(int A) {
        ans.add(1);
       return getRow(A,0);
        
    }
     public List<Integer> getRow(int A,int x){
          if(A==0)
        return ans;
         
         List<Integer> val=getRow(A-1,x);
        int n1=val.size();
        List<Integer> ok=new ArrayList<>();
        ok.add(1);
        
        for(int i=1,j=0;j<n1-1 && i<n1+1;j++){
                ok.add(val.get(i)+val.get(i-1));
                i++;
        }
        ok.add(1);
        return ok;
     }
}