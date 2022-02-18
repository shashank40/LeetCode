class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        if(n-k==0||num.equals("0"))
            return "0";
        char c[]=num.toCharArray();
        char prev=' ';
        String ans="";
        char arr[]=new char[n-k];
        int j=0;
        for(int i=0;i<n;i++){
            if(j<(n-k)&&(j==0||arr[j-1]<c[i])){
                arr[j]=c[i];
                j++;
                continue;
            }
            else{
            while(j>0 && arr[j-1]>c[i] && (n-k-j)<=(n-1-i)){
                j--;
            }   
                if(j<n-k){
                arr[j]=c[i];
                j++; }
            }
            
        }
        String ok="";
        boolean fun=false;
        for(char m:arr){
            if(m=='0'&&!fun)
                continue;
            fun=true;
            ok+=m;
        }
        if(ok.length()==0)
            return "0";
        
        return ok;
    }
}