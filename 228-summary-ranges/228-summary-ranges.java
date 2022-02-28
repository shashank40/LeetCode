class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i=0;
        int n=nums.length;
        List<String> arr=new ArrayList<>();
        while(i<n){
           int curr=nums[i];
            int next=curr;
            i++;
            while(i<n && nums[i]==curr)
                i++;
            while(i<n &&nums[i]==next+1){
                next=nums[i];
                i++;
            }
            
            if(next!=curr)
                arr.add(curr+"->"+next);
            else
                arr.add(curr+"");
                
        }
        
        return arr;
    }
}