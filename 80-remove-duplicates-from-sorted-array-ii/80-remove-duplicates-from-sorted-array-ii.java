class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i<n){
            if(i<n-1 && nums[i]==nums[i+1]){
                arr.add(nums[i]);
                arr.add(nums[i]);
                while(i<n && nums[i]==arr.get(arr.size()-1))
                    i++;
            }
            else{
                arr.add(nums[i]);
                i++;
            }
        }
        
        int curr=0;
        for(int a:arr)
            nums[curr++]=a;
        
        return arr.size();
    }
}