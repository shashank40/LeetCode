class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        
        if(n<3)
            return false;
        
        int val1=-1;
        int val2=-1;
        
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1])
                continue;
                else
                {
                    val1=i;
                    break;
                }
        }
        for(int i=n-1;i>0;i--){
            if(arr[i]<arr[i-1])
                continue;
                else
                {
                    val2=i;
                    break;
                }
        }
        
        if(val1==-1||val2==-1)
            return false;
        
        return (val1==val2);
    }
}