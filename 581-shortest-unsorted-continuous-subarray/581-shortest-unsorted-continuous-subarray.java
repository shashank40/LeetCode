class Solution {
    public int findUnsortedSubarray(int[] nums) {
        TreeSet<Integer> s=new TreeSet();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int a:nums){
            s.add(a); 
            mp.put(a,mp.getOrDefault(a,0)+1);
        }        
        int n=nums.length;
        int st=-1;
        int ed=-1;
         for(int i=0;i<n;i++){
            if(s.lower(nums[i])!=null)
            {st=i; 
            break;}
            
             if(mp.get(nums[i])==1){
            s.remove(nums[i]); 
             mp.remove(nums[i]);}
             else
                 mp.put(nums[i],mp.get(nums[i])-1);
        }      
        
        s.clear();
        mp.clear();
        for(int a:nums){
            s.add(a);
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        
        for(int i=n-1;i>=0;i--){
            if(s.higher(nums[i])!=null)
            {ed=i; 
            break;}
            mp.put(nums[i],mp.get(nums[i])-1);
            if(mp.get(nums[i])==0){
            s.remove(nums[i]); 
             mp.remove(nums[i]);
            }
             
        }
        if(ed==-1 && st==-1)
            return 0;
        return (ed-st+1);
        
    }
}