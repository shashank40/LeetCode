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
    public String tree2str(TreeNode root) {
        if(root == null)
            return "";
        
        String a = tree2str(root.left);
        String b = tree2str(root.right);
        if(b.length()>0) {
            a="("+a+")";
            b="("+b+")";
        }
        else if(a.length()>0)
            a="("+a+")";
        return (root.val + a + b);
    }
}