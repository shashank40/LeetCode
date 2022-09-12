class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n=tokens.length;
        int l=0;
        int r = n-1;
        int ans=0;
        int sum=0; ///// if conditions are true and we keep going on dosent mean wo faydemand hei
        // there might be a case ki phle ka move sahi tha ab sum dec, so we keep a seperarte ans;
        /// normal life mei bhi phle ham less wale power se dec krte rhete in order to increase 
        // sum and fir majboori mei sum dec to increase power(jitna zada ho ske) and then again try to increase sum, but maybe furthur se kuch fayda hota ni, maybe array khatam or whatever
        // kuch nahi kr skte to leave whin k whin ki ab sum decrease hi hoga, wahi we do ith break
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l++];
                sum++;
                ans=Math.max(ans,sum);
            }
            else if(sum>0){
                power+=tokens[r--];
                sum--;
            } 
            else break;
        }
        
        return ans;
    }
}