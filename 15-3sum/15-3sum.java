class Solution {
    List<List<Integer>> arr;
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> s=new HashSet<>();
        int n=nums.length;
        arr=new ArrayList<>(); 
        for(int i=0;i<n-2;i++){
            if(!s.contains(nums[i])){
                calcSum(nums[i],i+1,n-1,nums,n);
                    s.add(nums[i]);
            }
        }
        
        return arr;
    }
    
    public void calcSum(int sum, int l, int r, int nums[],int n){
        while(l<r){
            int c1=nums[l];
            int c2=nums[r];
            if(nums[l]+nums[r]+sum==0){
                arr.add(new ArrayList<Integer>());
                arr.get(arr.size()-1).add(sum);
                arr.get(arr.size()-1).add(nums[l]);
                arr.get(arr.size()-1).add(nums[r]);
                while(l<n && nums[l]==c1)
                    l++;
                while(r>0 && nums[r]==c2)
                r--;
            }
            else if(nums[l]+nums[r]+sum>0)
                r--;
            else
                l++;
        }
    }
}