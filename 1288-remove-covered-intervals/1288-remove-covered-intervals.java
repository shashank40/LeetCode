class Solution {
    public int removeCoveredIntervals(int[][] s) {
        int n=s.length;
        pair p[]=new pair[n];
        
        for(int i=0;i<n;i++){
            p[i]=new pair(s[i][0],s[i][1]);
        }
        
        Arrays.sort(p);
        int count=1;
        int j=p[0].b;
        
        for(int i=1;i<n;i++){
            if(p[i].b>j){
                count++;
                j=p[i].b;
            }
        }
        
        return count;
    }
}

class pair implements Comparable<pair>
{
    int a;
    int b;
    
    pair(int i, int j){
    a=i;
    b=j;
    }
    
    public int compareTo(pair p){
    if(this.a-p.a==0)
    return p.b-this.b;
    
    return this.a-p.a;
    }
}