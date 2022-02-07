class Solution {
    public char findTheDifference(String s, String t) {
        int a[]=new int[26];
        int n=s.length();
        int m=t.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            a[c-'a']++;
        }
        for(int i=0;i<m;i++)
        {
            char c=t.charAt(i);
            a[c-'a']--;
        }
        
        for(int i=0;i<26;i++)
            if(a[i]!=0)
                return (char)((int)'a'+i);
        
        return ' ';
    }
}