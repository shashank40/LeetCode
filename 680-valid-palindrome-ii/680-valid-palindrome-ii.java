class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){ ///// jaisi phla mismatch aaya usi time chek krlo ki i se aage ya j se phle pura palindrome to bs done, else tb bhi aage gadbad 
            if(s.charAt(i)!=s.charAt(j))
                return isPal(i+1,j,s)||isPal(i,j-1,s);
            
            i++;
            j--;
        }
        
        return true;
        
    }
    public boolean isPal(int i, int j, String s){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            
            i++;
            j--;
        }
        
        return true;
    }
}