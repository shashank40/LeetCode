class Solution {
    public List<List<Integer>> generate(int A) {
         List<List<Integer>> ans=new ArrayList<>();
        A--;
        for(int i=0;i<A+1;i++){
             ans.add(new ArrayList<>());
                ans.get(i).add(1);
        }

        for(int i=1;i<A+1;i++){
           for(int j=1;j<i;j++)
            ans.get(i).add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));

            ans.get(i).add(1);
        }

        return ans;
    }
}