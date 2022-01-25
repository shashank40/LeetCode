class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        
        if(n<3)
            return false;
        
        int val1=-1;
        int val2=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(i<n-1 && arr[i]<arr[i+1]){
                 max=Math.max(max,arr[i]);
                continue; }
            else if(i>0 && i<n-1 && arr[i]>max && arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {  val1=i;
                break;
            }
            else
                break;
            
           
        }
        max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(i>0 && arr[i]<arr[i-1]){
                max=Math.max(max,arr[i]);
                continue; }
            else if(i>0 && i<n-1 && arr[i]>max && arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {  val2=i;
                break;
            }
            else
                break;
        }
        if(val1==-1 || val2==-1)
            return false;
        
        return (val1==val2);
    }
}