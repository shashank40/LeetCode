class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s1.size()>0 && s.charAt(i)=='#')
                s1.pop();
            else if(s.charAt(i)!='#')
                s1.add(s.charAt(i));
        }
        n=t.length();
        for(int i=0;i<n;i++){
            if(s2.size()>0 && t.charAt(i)=='#')
                s2.pop();
            else if(t.charAt(i)!='#')
                s2.add(t.charAt(i));
        }
        
        if(s1.size()!=s2.size())
            return false;
        
        while(s1.size()>0){
            if(s1.peek()!=s2.peek())
                return false;
            
            s1.pop();
            s2.pop();
        }
        
        return true;
    }
}