class Solution {
    public String convertToTitle(int A) {
        String ans="";
        char c=' ';
        while(A>26){
            int val=A%26;
            if(val==0){
                val=26; 
                A--;}
           c=(char)('A'+val-1);
            ans=c+ans;
            A=A/26;
        }
        c=(char)('A'+A-1);
        ans=c+ans;

        return ans;
    }
}