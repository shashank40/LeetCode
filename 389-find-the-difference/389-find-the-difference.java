class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        int n=s.length();
        int m=t.length();
        
        for(int i=0;i<m;i++)
            sum+=(t.charAt(i)-'a');
        
        for(int i=0;i<n;i++)
            sum-=(s.charAt(i)-'a');
        
        
        return (char)((int)'a'+sum);
    }
}