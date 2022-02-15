class Solution {
    public int[] runningSum(int[] arr) {
        int n=arr.length; 
        int sum[]=new int[n];
        sum[0]=arr[0];
        for(int i=1;i<n;i++)
			sum[i]=sum[i-1]+arr[i];
        
        return sum;
    }
}