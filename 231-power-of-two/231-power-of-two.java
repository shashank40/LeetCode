class Solution {
    public boolean isPowerOfTwo(int A) {
        if(A<=0)
            return false;
        
       if((A&(A-1))==0)
           return true;
        
        return false;
    }
}