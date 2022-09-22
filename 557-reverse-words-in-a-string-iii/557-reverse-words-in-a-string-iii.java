class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String ans = "";
        for(String a: arr){
            ans+=reverse(a) + " ";
        }
        
        return ans.substring(0,s.length());
    }
    public String reverse(String s){
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            ans=s.charAt(i)+ans;
        }
        
        return ans;
    }
}