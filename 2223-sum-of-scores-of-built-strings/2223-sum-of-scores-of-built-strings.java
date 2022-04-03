class Solution {
    public long sumScores(String s) {
        int n=s.length();
        long z[]=new long[n];
        long count=n;
        int l=0,r=0;
        for(int i=1;i<n;i++){
            if(i<=r){
                z[i]=Math.min(z[i-l],r-i+1);
            }
            
            while((i+z[i])<n && s.charAt((int)z[i])==s.charAt(i+(int)z[i]))
                z[i]++;
            
            count+=z[i];
            
            if(i+(int)z[i]-1>r){
                l=i;
                r=i+(int)z[i]-1;
            }
        }
        
        return count;
        
    }
}