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
    List<Integer> arr;
    public List<Integer> inorderTraversal(TreeNode root) {
        arr = new ArrayList<>();
        if(root == null)
            return arr;
        
        inOrder(root);
        
        return arr;
        
    }
    
    public void inOrder(TreeNode root){
        
        if(root.left!=null)
            inOrder(root.left);
        
        arr.add(root.val);
        
        if(root.right!=null)
            inOrder(root.right);
    } 
}