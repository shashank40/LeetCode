class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int n1=p.length();
        int st=0;
        int en=n1-1;
        int val1[]=new int[26];
        int val2[]=new int[26];
        ArrayList<Integer> ans=new ArrayList<>();
        if(n<n1)
            return ans;
        
        for(int i=0;i<n1;i++){
            char c=s.charAt(i);
            val1[c-'a']++;
            c=p.charAt(i);
            val2[c-'a']++;
        }
        
        if(isEqual(val1,val2))
                ans.add(st);
        while(en<=n-1){
                val1[s.charAt(st)-'a']--;
                st++;
                en++;
                if(en<=n-1){
                    val1[s.charAt(en)-'a']++;
                    if(isEqual(val1,val2))
                        ans.add(st);        
                    }
             }
        
        return ans;
    }
    
    public boolean isEqual(int val1[], int val2[]){
        for(int i=0;i<26;i++)
            if(val1[i]!=val2[i])
                return false;
        
        return true;
    }
}