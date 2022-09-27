class Solution {
    public String pushDominoes(String dom) {
        int n= dom.length();
        char x[]=dom.toCharArray();
        int left[]=new int[n];
        int currL=1000001;
        for(int i=n-1;i>=0;i--){
            left[i]=currL-i;
            char c=x[i];
            if(c=='L'){
                left[i]=0;
                currL = i; 
            }
            else if(c=='R')
                currL=1000001;
                
        }
        
        StringBuilder ans = new StringBuilder();
        int currR=-1000001;
        for(int i=0;i<n;i++){
            
            char c=x[i];
            int dist=0;
            if(c=='R'){
                currR=i;
                ans.append('R');
            }
            else if(c=='L'){
                currR=-1000001;
                ans.append('L');
            }
            else{
                dist=Math.min(left[i],i-currR);
                if(dist>100000 || (left[i]==i-currR))
                    ans.append('.');
                else{
                    if(left[i]==dist)
                        ans.append('L');
                    else
                        ans.append('R');
                }
            }
        }
        
        return ans.toString();
    }
}