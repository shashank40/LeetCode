class Solution {
    public int addDigits(int num) {
        
        if(val(num)==1)
            return num;
        
        while(val(num)>1){
            num=sum(num);
        }
        
        return num;
    }
    
    public int val(int nums){
        int count=0;
       while(nums>0)
       {
           count++;
           nums=nums/10;
       }
        return count;
    }
    
    public int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        
        return sum;
    }
}