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
    public int kthSmallest(TreeNode root, int k) {     
        int left=count(root.left);
        if(left+1==k)
            return root.val;
        else if(k<=left && root.left!=null)
            return kthSmallest(root.left,k);
        else if(k>left && root.right!=null)
            return kthSmallest(root.right,k-1-left);
        else 
            return -1;
    }
    
    public int count(TreeNode root){
        if(root==null)
            return 0;
        
        return 1+count(root.left)+count(root.right);
    }
}