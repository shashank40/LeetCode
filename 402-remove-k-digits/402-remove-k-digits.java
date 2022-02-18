class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        if(n<=k)
            return "0";
        
        int m=n-k;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<n;i++){
             char c=num.charAt(i);
            if(s.size()<m && (s.size()==0||c>=s.peek())){
                s.push(c);
                continue;
                }
            if(c>=s.peek())
                continue;
            
            while(s.size()>0 && (n-1-i)>=(m-s.size()) && c<s.peek())
                s.pop();
            
            s.push(c);
        }
               
        if(s.size()==0)
            return "0";
        
        String ans="";
        
        while(s.size()>0)
            ans=s.pop()+ans;
        
        int z=ans.length();
        int i=0;
        
        while(i<z && ans.charAt(i)=='0'){
            i++;
        }
        
        ans=ans.substring(i);
        if(ans.length()==0)
            return "0";
        
        return ans;
    }
}