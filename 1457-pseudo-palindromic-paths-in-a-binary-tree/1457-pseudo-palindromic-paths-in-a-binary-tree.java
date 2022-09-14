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
    public int pseudoPalindromicPaths (TreeNode root) {
        if(root==null)
            return 0;
        
        HashSet<Integer> s = new HashSet<>();
        return DFS(root,s);
    }
    
    public int DFS(TreeNode root, HashSet<Integer> s){
        int p=1;
        if(s.contains(root.val)){
            s.remove(root.val);
            p=0;
        }
        else
            s.add(root.val);
        
        if(root.left == null && root.right==null){
            if(s.size()<=1){
                if(p==0)
            s.add(root.val);
            else
            s.remove(root.val);
                return 1;
            }
            if(p==0)
            s.add(root.val);
            else
            s.remove(root.val);
            return 0;
        }
        
        int sum=0;
        
        if(root.left!=null)
            sum+=DFS(root.left,s);
        if(root.right!=null)
            sum+=DFS(root.right,s);
        
        if(p==0)
            s.add(root.val);
        else
            s.remove(root.val);
        
        return sum;
    }
}