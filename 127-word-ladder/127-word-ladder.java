class Solution {
    public int ladderLength(String begin, String end, List<String> wordList) {
        HashSet<String> s=new HashSet<>();
        for(String a:wordList)
            s.add(a);
        if(!s.contains(end))
            return 0;
        
        Queue<String> q=new LinkedList<>();
        HashMap<String,Integer> mp=new HashMap<>();   ////////// BFS GRAPH
        
        q.add(begin);
        mp.put(begin,1);
        s.remove(begin);
        while(!q.isEmpty()){
            String curr=q.poll();
            int val=mp.get(curr);
            mp.remove(curr);
            char c[]=curr.toCharArray();
            int n=c.length;
            for(int i=0;i<n;i++){
                char a=c[i];
                for(int j=0;j<26;j++){
                    if(j!=a-'a'){
                        c[i]=(char)((int)('a')+j);
                        String pup=new String(c);
                        if(end.equals(pup))
                            return val+1;
                        else{
                            if(s.contains(pup)){
                            q.add(pup);
                            mp.put(pup,val+1);
                            s.remove(pup);}
                            
                        }
                        c[i]=a;
                    }
                }
                    
            }
        }
        
        return 0;
    }
}