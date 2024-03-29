class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rotate(nums,0,n-1-k);
        rotate(nums,n-k,n-1);
        rotate(nums,0,n-1);
    }
    
    public void rotate(int arr[], int i, int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}