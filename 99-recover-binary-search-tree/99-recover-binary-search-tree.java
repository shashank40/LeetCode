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
    ArrayList<Integer> arr=new ArrayList<>();
    ArrayList<TreeNode> arr2=new ArrayList<>();
    int i=0;
    public void recoverTree(TreeNode root) {
        fill(root);
        Collections.sort(arr);
            int i=0;
        for(int a:arr){
            arr2.get(i++).val=a;
        }
    }
    
    public void fill(TreeNode root){
        if(root==null)
            return;
        
        fill(root.left);
        arr.add(root.val);
        arr2.add(root);
        fill(root.right);
    }
    
}