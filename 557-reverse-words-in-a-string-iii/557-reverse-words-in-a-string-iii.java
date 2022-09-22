class Solution {
    public String reverseWords(String s) {
        int n=s.indexOf(" ");
        int i=0;
        String ans="";
        while(n>=0){
            String c=reverse(s.substring(i,n));
            ans+= (c + " " );
            i=n+1;
            n=s.indexOf(" ",i);
        }
        ans+=(reverse(s.substring(i)));
        return ans;
    }
    
    public String reverse(String s){
        char c[]=s.toCharArray();
        String a="";
        int n=c.length;
        
        for(int i=n-1;i>=0;i--){
            a+=c[i];
        }
        
        return a;
    }
}