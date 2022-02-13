class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        val(0,nums,n,arr);
        
        return ans;
    }
    
    public void val(int i, int nums[], int n,ArrayList<Integer> arr){
        if(i==n){
            ans.add(new ArrayList<>());
            for(int a:arr){
                ans.get(ans.size()-1).add(a);
            }
            
            return;
        }
        arr.add(nums[i]);
        val(i+1,nums,n,arr);
        arr.remove(arr.size()-1);
        val(i+1,nums,n,arr);

    }
}