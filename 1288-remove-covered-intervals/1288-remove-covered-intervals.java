class Solution {
    public int removeCoveredIntervals(int[][] s) {
        int n=s.length;
        Arrays.sort(s,new cmp());
//         pair p[]=new pair[n];
        
//         for(int i=0;i<n;i++){
//             p[i]=new pair(s[i][0],s[i][1]);
//         }
        
//         Arrays.sort(p);
        int count=1;
        int j=s[0][1];
        
        // for(int i=1;i<n;i++){
        //     if(p[i].b>j){
        //         count++;
        //         j=p[i].b;
        //     }
        // }
        for(int i=1;i<n;i++){
            if(s[i][1]>j){
                count++;
                j=s[i][1];
            }
        }
        return count;
    }
}

// class pair implements Comparable<pair>
// {
//     int a;
//     int b;
    
//     pair(int i, int j){
//     a=i;
//     b=j;
//     }
    
//     public int compareTo(pair p){
//     if(this.a-p.a==0)
//     return p.b-this.b;
    
//     return this.a-p.a;
//     }
// }
class cmp implements Comparator<int[]>{ ////////// <HERE WE PUT NON PRIMITIVE TYPES, so int[] is non primitive too>
    public int compare(int a[], int b[])
    {
        if(a[0]-b[0]==0)
        return b[1]-a[1];
        
        return a[0]-b[0];
    }
    }