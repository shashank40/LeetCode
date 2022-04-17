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
    public TreeNode increasingBST(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
            return root;
        
        TreeNode left=increasingBST(root.left);
        root.left=null;
        TreeNode right=increasingBST(root.right);
        root.right=null;
        TreeNode temp=left;
        while(temp!=null && temp.right!=null)
            temp=temp.right;
        
        if(temp!=null)
            temp.right=root;
        root.right=right;
        
        if(left!=null)
            return left;
        
        return root;
        
    }
}