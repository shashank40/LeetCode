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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,targetSum));
        
        while(!q.isEmpty()){
            pair temp=q.poll();
            if(temp.node.left==null && temp.node.right==null)
                if (temp.sO-temp.node.val==0)
                    return true;
            
            if(temp.node.left!=null)
                q.add(new pair(temp.node.left, temp.sO-temp.node.val));
            
            if(temp.node.right!=null)
                q.add(new pair(temp.node.right, temp.sO-temp.node.val));
        }
        
        return false;
    }
    class pair {
        TreeNode node;
        int sO;
        
        pair(TreeNode n, int sum){
            node=n;
            sO=sum;
        }
    }
}