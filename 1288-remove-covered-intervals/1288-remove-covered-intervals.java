class Solution {
    public int removeCoveredIntervals(int[][] s) {
        int n=s.length;
        Arrays.sort(s,new cmp());
        int count=1;
        int j=s[0][1];
        
        for(int i=1;i<n;i++){
            if(s[i][1]>j){
                count++;
                j=s[i][1];
            }
        }
        return count;
    }
}
class cmp implements Comparator<int[]>{ ////////// <HERE WE PUT NON PRIMITIVE TYPES, so int[] is non primitive too>
    public int compare(int a[], int b[])
    {
        if(a[0]-b[0]==0)
        return b[1]-a[1];
        
        return a[0]-b[0];
    }
    }