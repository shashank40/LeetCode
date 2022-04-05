class Solution {
    public int maxArea(int[] h) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(h[0],0);
        int n=h.length;
        int lmax[]=new int[n];
        lmax[0]=-1;
        int ans=Integer.MIN_VALUE;
        arr.add(h[0]);
        for(int i=1;i<n;i++){
            if(arr.get(0)>=h[i])
                lmax[i]=arr.get(0);
            else{
                lmax[i]=find(arr,h[i]);
            }
            if(lmax[i]>0){
                
                ans=Math.max(ans,Math.min(lmax[i],h[i])*(i-mp.get(lmax[i])));
            }
            if(arr.get(arr.size()-1)<h[i]){
                mp.put(h[i],i);
                arr.add(h[i]); 
            }
        }
        
        Arrays.fill(lmax,-1);
        mp.clear();
        arr.clear();
        mp.put(h[n-1],n-1);
        arr.add(h[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr.get(0)>=h[i])
                lmax[i]=arr.get(0);
            else{
                lmax[i]=find(arr,h[i]);
            }
            if(lmax[i]>0){
                ans=Math.max(ans,Math.min(lmax[i],h[i])*(mp.get(lmax[i])-i)); }
            if(arr.get(arr.size()-1)<h[i]){
                mp.put(h[i],i);
                arr.add(h[i]); 
            }
        }
        return ans;
    }
    
    public int find(ArrayList<Integer> arr, int f){
        int l=0;
        int r=arr.size()-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr.get(m)>=f){
                ans=arr.get(m); 
            r=m-1;}
            else if(arr.get(m)<f)
                l=m+1;
            else
                r=m-1;
        }
        
        return ans;
    }
}