class Solution {
    public boolean search(int[] nums, int target) {
        ///Logic is focus on sorted part, if not in that then move to another.
        //// worst case becomes linear as jb duplicates will have to pass them linearly
        /// ex 10111 , target 0
        /// if l and mid wala same to dk where to go, to l++ ki next wale se check kro ki ye sorted part hei ya duplocate
        //// if l wala < m means left sorted then do jaise krte hein
        ////   
        int l=0;
        int r=nums.length-1;
        
        while(l<=r){
                
            int m=l+(r-l)/2;
            
            if(nums[m]==target)
                return true;
            else if(nums[m]>nums[l]){
                if(nums[m]>target && nums[l]<=target)
                    r=m-1;
                else
                    l=m+1;
                     //// only viewing from left k perspective ki if l wala and mid wala same , dont know where to go, to try to do l++ to have new check.
            }
            
            else if(nums[m]<nums[l]){
                if(nums[m]<target && nums[r]>=target)
                    l=m+1;
                else
                    r=m-1;
            }
            else
                l++;
        }
        
        return false;
    }
}