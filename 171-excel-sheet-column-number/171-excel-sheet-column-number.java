class Solution {
    public int titleToNumber(String A) {
        int n=A.length();
       int sum=0;
       int curr=0;
       for(int i=n-1;i>=0;i--){
           char c=A.charAt(i);
           sum+=((c-'A'+1)*(int)Math.pow(26,curr));
           curr++;
       }

       return sum;
        
    }
}