class Solution {
    Integer t[]=new Integer[100001];
    public boolean winnerSquareGame(int n) {
        if(n==0)
            return true;
        
        if(n==2)
            return false;
        
        if(t[n]!=null)
        {
            if(t[n]==(Integer)1)
                return true;
            
            return false;
        }
        boolean v=false;
        
        if(isSq(n-2)||n==1||isSq(n))
            return true;
        
        for(int i=1;i*i<=n;i++){
            int val=i*i;
            if(!isSq(n-val) && !winnerSquareGame(n-val))
                {
                v=true;
                t[n]=(Integer)1;
                return true;
            }
        }
        t[n]=(Integer)0;
        return false;
    }
    
    public boolean isSq(int n){
        if(n==1 || n==0)
            return true;
        
        int s=(int)Math.pow(n,.5);
        
        if(s*s==n)
            return true;
        
        return false;
    }
}