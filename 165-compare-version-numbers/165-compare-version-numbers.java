class Solution {
    public int compareVersion(String v1, String v2) {
        ArrayList<String> arr1=split(v1);
        ArrayList<String> arr2=split(v2);
        int i=0;
        int m=arr1.size();
        int n=arr2.size();
        int curr=10;
        while(i<m || i<n){
            if(i<m && i<n){
                curr=Integer.parseInt(arr1.get(i))-Integer.parseInt(arr2.get(i));
                if(curr<0)
                    return -1;
                if(curr>0)
                    return 1;
                
            }  
            else if(i<m){
                curr=Integer.parseInt(arr1.get(i))-0;
                if(curr<0)
                    return -1;
                if(curr>0)
                    return 1;
            }
            else{
                curr=0-Integer.parseInt(arr2.get(i));
                if(curr<0)
                    return -1;
                if(curr>0)
                    return 1;
                    
            }
            i++;
        }
        
        
        
        return 0;
    }
    
    public ArrayList<String> split(String v1){
        int n=v1.length();
        ArrayList<String> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(j<n){
            char c=v1.charAt(j);
            if(c=='.'){
                ans.add(v1.substring(i,j));
                i=j+1;
            }
            j++;
        }
        ans.add(v1.substring(i));
        return ans;
    }
}