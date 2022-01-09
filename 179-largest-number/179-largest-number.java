class Solution {
    public String largestNumber(int[] A) {
//           String s1="";
//         String s2="";
//         int val=0;
//         for(int i=0;i<n-1;i++){    WAYYYYYYYYYYYY 1
//             for(int j=i+1;j<n;j++){
//                 s1=arr[i]+""+arr[j];
//                 s2=arr[j]+""+arr[i];

//                 if(s1.compareTo(s2)>=0)
//                 continue;
//                 else
//                 {
//                     val=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=val;
//                 }
                
//             }
//         }
        
//         if(arr[0]==0)
//         return "0";
//         String s="";

//         for(int i=0;i<n;i++)
//         s+=arr[i];

//         return s;
        
        
        ////////// WAYYYYY 2 USING COMPARATOR
        
        int n=A.length;
        Integer arr[]=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=(Integer)A[i];
        }
        Arrays.sort(arr,new cmp());
        
        if(arr[0]==0)
        return "0";
        
        String s="";
        for(int i=0;i<n;i++){
                s+=arr[i];
        }

        return s;
    }
}
class cmp implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        String ab=a+""+b;
        String ba=b+""+a;

        return ba.compareTo(ab);
        //////// now if we want increasing order sort, mtlb bada baad mei
        /// now if ab>ba means a>b(in terms of joining) now agr mei increasing order mei sort krna chahta hun
        //////// to sort in increasing order means a baad mei aae b k in array,
        /////// return +ve, to usko lgega +v aaya mtlb this(here a) is > b as +ve came out
        /// so sorted that way.
        //// can be done directly by compareto function of strings, returns +ve if a>b
    }
}