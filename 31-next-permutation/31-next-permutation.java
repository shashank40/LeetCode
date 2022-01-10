class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        
        int temp=0;
    int max=Integer.MIN_VALUE;
    int part=-1;
        for(int i=n-1;i>0;i--){
            temp=arr[i];
            for(int j=i-1;j>=0;j--){
                    if(arr[j]<temp){
                       if(j>max){
                            max=j;
                            part=i;
                        } 
                    }
            }
        }

       if(part==-1){
        for(int i=0;i<n/2;i++)
        {
            part=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=part;
        }
        return;}

        temp=arr[part];
        arr[part]=arr[max];
        arr[max]=temp;

       Arrays.sort(arr,max+1,n);
    }
}