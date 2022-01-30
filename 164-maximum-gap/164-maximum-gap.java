class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<=1)
        return 0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=nums[i];
        Arrays.sort(arr);
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        max=Math.max(max,arr[i]-arr[i-1]);

        return max;
        
    }
}