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
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        
        int left=left(root.left);
        int right=right(root.right);
        if(right==left)
            return (int)Math.pow(2,left+1)-1;
        
        return calc(root);
       
    }
    
    public int left(TreeNode root){
        if(root==null)
            return 0;
        
        return 1+left(root.left);
    }
    public int right(TreeNode root){
        if(root==null)
            return 0;
        
        return 1+right(root.right);
    }
public int calc(TreeNode root){
    if(root==null)
            return 0;
     return calc(root.left)+calc(root.right)+1;
}
}
