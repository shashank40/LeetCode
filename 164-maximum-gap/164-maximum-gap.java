class Solution {
    public int maximumGap(int[] arr) {
        int n=arr.length;
        if(n<=1)
        return 0;
        
       int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        
        double size=(double)(max-min)/(double)(n);
        int mx[]=new int[n];
        int mn[]=new int[n];
        Arrays.fill(mn,Integer.MAX_VALUE);
        Arrays.fill(mx,Integer.MIN_VALUE);
        
        for(int i=0;i<n;i++){
            if(arr[i]==min || arr[i]==max) continue;
            int index=(arr[i]-min)/(int)Math.ceil(size);
            mx[index]=Math.max(mx[index],arr[i]);
            mn[index]=Math.min(mn[index],arr[i]);
        }
        int ans=0;
        int prev=min;
        for(int i=0;i<n;i++){
            if(mn[i]==Integer.MAX_VALUE)continue;
            ans=Math.max(ans,mn[i]-prev);
        prev=mx[i];}
        
        
            ans=Math.max(ans,max-prev);
        
        return ans;
    }
}