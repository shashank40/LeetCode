class Solution {
    public int lengthOfLIS(int[] A) {
        ArrayList<Integer> arr=new ArrayList<>();
		int n=A.length;
		int val=0;
		for(int i=0;i<n;i++){
			if(arr.size()==0 || arr.get(arr.size()-1)<A[i])
				arr.add(A[i]);
			else{
				val=BS(A[i],arr);
				if(val==-1)
					continue;
				else
					arr.set(val,A[i]);
			}
		}
		
		return arr.size();
	}
	int BS(int val, ArrayList<Integer> arr){
		int i=0;
		int j=arr.size()-1;
		int ans=-1;
		while(i<=j){
			int m=i+(j-i)/2;
			if(arr.get(m)==val)
				return -1;
			else if(arr.get(m)>val){
				ans=m;
				j=m-1;
			}
			else
				i=m+1;
		}
		
		return ans;
    }
}