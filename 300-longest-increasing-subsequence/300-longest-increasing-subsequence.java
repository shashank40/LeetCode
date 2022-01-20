class Solution {
    HashMap<Integer,Integer> t;
    public int lengthOfLIS(int[] A) {
    	t= new HashMap<>();
		
		return ans(A,Integer.MIN_VALUE,0);
	}
	
	int ans(int A[], int prev, int i){
		if(i==A.length)
			return 0;
		
		if(t.containsKey(prev))
			return t.get(prev);
		
			int and=-1;
		
			
		
		if(prev==Integer.MIN_VALUE || A[i]>A[prev]){
			if(t.containsKey(i))
				and=t.get(i);
			
			if(and==-1)
		t.put(prev,(Math.max(1+ans(A,i,i+1),ans(A,prev,i+1))));
			else
				t.put(prev,(Math.max(1+and,ans(A,prev,i+1))));
			
			return t.get(prev);
			
		}
		
		t.put(prev,(ans(A,prev,i+1)));
			return t.get(prev);
	}
}
    