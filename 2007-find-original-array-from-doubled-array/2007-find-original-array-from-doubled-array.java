class Solution {
    public int[] findOriginalArray(int[] c) {
        if(c.length % 2 !=0 )
            return new int[0];
        // go from max to min(as tbhi we can check for all )
        Arrays.sort(c);
        int arr[] = new int[c.length/2];
        int j=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int a:c){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        
        for(int i=c.length-1;i>=0;i--){
            if(c[i]==0 && mp.containsKey(c[i]))
            {
                if(mp.get(c[i])%2==0)
                {
                    arr[j++]=0;
                    if(mp.get(c[i])==2)
                        mp.remove(c[i]/2);
                    else
                        mp.put(c[i]/2,mp.get(c[i])-2);
                }
                else
                {
                    arr = new int[0];
                    return arr;
                }
                
                continue;
            }
            if(c[i]%2==0 && mp.containsKey(c[i])){
                if(mp.containsKey(c[i]/2)){
                    arr[j++] = c[i]/2;
                    if(mp.get(c[i]/2)==1)
                        mp.remove(c[i]/2);
                    else
                        mp.put(c[i]/2,mp.get(c[i]/2)-1);  
                }
                
                if(mp.get(c[i])==1)
                        mp.remove(c[i]);
                    else
                        mp.put(c[i],mp.get(c[i])-1);
            }
            
        }
        if(j!=arr.length){
            arr = new int[0];
                    return arr;
        }
        
        return arr;
    }
}