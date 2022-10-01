class Solution {
    Integer t[];
    char arr[];
    public int numDecodings(String s) {
        t=new Integer[s.length()];
        arr=s.toCharArray();
        return value(s.length(),0);
    }
    
    public int value(int n, int i){
        if(i==n)
            return 1;
        if(arr[i]=='0')
            return 0;
        if(t[i]!=null)
            return t[i];
        
        int sum=0;
        
        sum+=value(n,i+1);
        if(i+1<n && ((arr[i]-'0')*10 + (arr[i+1]-'0')) <= 26)
           sum+=value(n,i+2);
           
           return t[i]=sum;
    }
}