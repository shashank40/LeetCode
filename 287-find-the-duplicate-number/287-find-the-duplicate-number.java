class Solution {
    public int findDuplicate(int[] A) {
     int slow=A[0];
        int fast=A[A[0]];
        
        while(slow!=fast){
            slow=A[slow];
            fast=A[A[fast]];
        }
        fast=0;
        
        while(fast!=slow){
            fast=A[fast];
            slow=A[slow];
        }
        
        return slow;
        
    }
}