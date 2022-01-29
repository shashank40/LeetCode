class Solution {
    class Trie{
        
        class Node{ ///// trie ki each part is a node
            Node left; /// if not null depicts 1 is present
            Node right; /// if not null depicts 1 is present
        }
        
        Node root; /// as we call trie a root node is made;
        Trie(){
            root=new Node(); //// object is of Node made when object made of Trie
        }
        
        public void insert(int val){
            //// steps to insert a number
            //// find a mask, now find current bit in val , if 1 and right present move on, else make right
            /// if 0 and left is present then move on else make left
            
            int bit=31;
            Node curr=root;
            while(bit>=0){
                int mask=1<<bit;
                int currBit=(mask&val)>0?1:0;
                
                if(currBit==1){
                    if(curr.right==null)
                        curr.right=new Node();
                    
                    curr=curr.right;
                }
                else{
                    if(curr.left==null)
                        curr.left=new Node();
                    
                    curr=curr.left;
                }
                
                bit--;
            }
        }
        
        public int query(int find){
            /// steps to find is closer to insert,
            /// run in trie, if found number with similar bit then return that else closer;
             int bit=31;
            Node curr=root;
            int ans=0;
            while(bit>=0){
                int mask=1<<bit;
                int currBit=(mask&find)>0?1:0;
                
                if(currBit==1){
                    if(curr.right!=null)
                       {  ans=ans|mask;
                        curr=curr.right;
                        }
                    else{
                        curr=curr.left;
                    }
                    
                }
                else{
                    if(curr.left!=null)
                    curr=curr.left;
                    else{
                         ans=ans|mask;
                        curr=curr.right;
                    }
                }
                
                bit--;
            }
            
            return ans;
        }
        
    }
    public int findMaximumXOR(int[] nums) {
        
    /// LOGIC STARTS HERE STEP BY STEP
        
    //// a^b=t , the t^a=b(t be the answer we would always want it to be  1111..111 all 1's so we will try to find it)
        /// we already have a prefix(a^t) ans with that prefix we want to find closest number, to do that prefix search
        //// trie is best
    //// we have a , we want to find can we get a particular b(or similar in bits) to maximize our answer
        
        Trie root=new Trie();
        /// now put numbers in trie
        for(int val:nums){
            root.insert(val);
        }
        /// now lets find max answer;
        int ans=Integer.MIN_VALUE;
        for(int val:nums){
            int curr=root.query(Integer.MAX_VALUE^val);//// find that number(b) or closest in term of bit position
                ///Integer.MAX_VALUE(t) as we would always want ans to be max or as closest
            ans=Math.max(ans,val^curr);
        }
        
        return ans;
        
    /// Now lets make the classs and its required function.
    }
}