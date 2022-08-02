class Solution {
    public int romanToInt(String A) {
                int n=A.length();
        int sum=0;
        int max=0;
        for(int i=n-1;i>=0;i--){
            char c=A.charAt(i);
            int val=value(c);
            if(val>=max){
                max=val;
                sum+=val;
            }
            else
            sum-=val;
        }
        
        return sum;
    }
    
    public int value(char c){
        
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
                }
    }
}