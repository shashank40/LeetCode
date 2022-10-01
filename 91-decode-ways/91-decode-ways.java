class Solution {
    Integer t[];
    public int numDecodings(String s) {
        t=new Integer[s.length()];
        char arr[]=s.toCharArray();
        return value(s.length(),0,arr);
    }
    
    public int value(int n, int i, char arr[]){
        if(i==n)
            return 1;
        if(arr[i]=='0')
            return 0;
        if(t[i]!=null)
            return t[i];
        
        int sum=0;
        
        sum+=value(n,i+1,arr);
        if(i+1<n && ((arr[i]-'0')*10 + (arr[i+1]-'0')) <= 26)
           sum+=value(n,i+2,arr);
           
           return t[i]=sum;
    }
}