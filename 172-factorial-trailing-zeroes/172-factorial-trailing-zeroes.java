class Solution {
    public int trailingZeroes(int A) {
        int count=0;
        for(int i=1;i<=A;i++){
            int curr=i;
            while(curr%5==0){
                count++;
                curr=curr/5;
            }
        }

        return count;
    }
}