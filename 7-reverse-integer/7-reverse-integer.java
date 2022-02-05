class Solution {
    public int reverse(int A) {
         int nums=0;
        int p=0;
        
        
        if(A<0){
            p=1;
            A=-1*A;
        }
        String b=A+"";
        int val=(int)Math.pow(10,b.length()-1);
        while(A!=0){

            if(nums*10+A%10<0)
            return 0;

            nums=nums*10+A%10;
            A=A/10;
        }
        if((b.charAt(b.length()-1)-'0') != nums/val)
        return 0;
        
        if(p==1)
        return -1*nums;

        return nums;
    }
}