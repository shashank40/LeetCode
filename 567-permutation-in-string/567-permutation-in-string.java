class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())
            return false;
        
        return ans(s1,s2);
    
    }
    public boolean ans(String s1, String s2){
        int val1[]=new int[26];
        int val2[]=new int[26];
        int m=s1.length();
        int n=s2.length();
        char c=' ';
        
        for(int i=0;i<m;i++){
            c=s1.charAt(i);
            val1[c-'a']++;
            c=s2.charAt(i);
            val2[c-'a']++;
        }
        if(iseq(val1,val2))
            return true;
        
        for(int i=m;i<n;i++){
            c=s2.charAt(i-m);
            val2[c-'a']--;
            c=s2.charAt(i);
            val2[c-'a']++;
            
            if(iseq(val1,val2))
                return true;
        }
        
        return false;
    }
    
    public boolean iseq(int val1[],int val2[]){
        for(int i=0;i<26;i++)
            if(val1[i]!=val2[i])
                return false;
        
        return true;
    }
}