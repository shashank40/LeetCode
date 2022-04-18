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
        if(root==null)
            return 0;
       PriorityQueue<Integer> pq=new PriorityQueue<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            pq.add(temp.val);
            
            if(temp.left!=null)
                q.add(temp.left);
            
            if(temp.right!=null)
                q.add(temp.right);
        }
        
        int count=0;
        while(count!=k-1){
            pq.poll();
            count++;
        }
        
        return pq.peek();
    }
}