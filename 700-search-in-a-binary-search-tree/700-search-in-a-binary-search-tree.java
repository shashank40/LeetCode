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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode tmp=root;
        
        while(tmp!=null){
            if(tmp.val==val)
                return tmp;
            else if(tmp.val>val)
                tmp=tmp.left;
            else
                tmp=tmp.right;
        }
        
        return null;
    }
}