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
    public TreeNode convertBST(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
            return root;
        
        set(root,0);
        
        return root;
    }
    public void set(TreeNode root,int prev){
        if(root==null)
            return;
        
        int right=sum(root.right);
        root.val+=(right+prev);
        set(root.left,root.val);
        set(root.right,prev);
    }
    
    public int sum(TreeNode root){
        if(root==null)
            return 0;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            sum+=temp.val;
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
            
        }
        
        return sum;
    }
}