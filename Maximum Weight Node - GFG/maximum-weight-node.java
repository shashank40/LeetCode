//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int Edge[] = new int[N];
            for(int i = 0; i < N; i++)
                Edge[i] = sc.nextInt();
            Solution ob = new Solution();
            int ans = ob.maxWeightCell(N, Edge);
            out.println(ans);            
        }
        out.flush();
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int maxWeightCell(int N, int Edge[]){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int maxwt = Integer.MIN_VALUE;
        int max = 0;
        int n = Edge.length;
        
        for(int i = 0; i<n;i++){
            int curr = Edge[i];
            if(curr<0)
             continue;
             
            mp.put(curr, mp.getOrDefault(curr,0)+i);
            
            if(mp.get(curr)>=maxwt){
                maxwt = mp.get(curr);
                max = curr;
            }
        }
        
        return max;
        
    }
}