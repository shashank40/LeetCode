class Solution {
    public int maximumGap(int[] arr) {
        int n=arr.length;
        if(n<=1)
        return 0;
        Arrays.sort(arr);
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        max=Math.max(max,arr[i]-arr[i-1]);

        return max;
        
    }
}