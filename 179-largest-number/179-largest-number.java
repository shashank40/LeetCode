class Solution {
    public String largestNumber(int[] arr) {
        int n=arr.length;
          String s1="";
        String s2="";
        int val=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                s1=arr[i]+""+arr[j];
                s2=arr[j]+""+arr[i];

                if(s1.compareTo(s2)>=0)
                continue;
                else
                {
                    val=arr[i];
                    arr[i]=arr[j];
                    arr[j]=val;
                }
                
            }
        }
        
        if(arr[0]==0)
        return "0";
        String s="";

        for(int i=0;i<n;i++)
        s+=arr[i];

        return s;
    }
}