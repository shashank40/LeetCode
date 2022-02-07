class Solution {
    public int fib(int A) {
         int a=1;
        int b=1;
        int curr=0;
        int n=2;
        if(A==1||A==2)
        return 1;

        while(n<A){
            curr=(a+b);
            a=b;
            b=curr;
            n++;
        }

        return curr;
    }
}