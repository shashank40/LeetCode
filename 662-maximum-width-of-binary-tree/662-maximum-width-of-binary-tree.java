/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int max=Integer.MIN_VALUE;
        Deque<TreeNode> q=new LinkedList<>();
        HashMap<TreeNode,Integer> mp=new HashMap<>();
        q.add(root);
        mp.put(root,0);
        while(!q.isEmpty()){
            int count=q.size();
            max=Math.max(max,mp.get(q.peekLast())-mp.get(q.peekFirst())+1);
            for(int i=0;i<count;i++){
                TreeNode temp=q.pollFirst();
                if(temp.left!=null){
                q.addLast(temp.left); 
                mp.put(temp.left,2*mp.get(temp)+1);}
                if(temp.right!=null){
                q.addLast(temp.right); 
                    mp.put(temp.right,2*mp.get(temp)+2);
                }
            }
        }
        
        return max;
    }
}