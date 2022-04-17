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
        if(root==null)
            return null;
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<TreeNode> arr=new ArrayList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp.left!=null){
                q.add(temp.left);
                temp.left=null;
            }
            if(temp.right!=null){
                q.add(temp.right);
                temp.right=null;
            }
            
            arr.add(temp);
        }
        
        Collections.sort(arr,new myCmp());
        TreeNode temp=new TreeNode(-1);
        TreeNode temp2=temp;
        for(TreeNode a:arr){
            temp2.right=a;
            temp2=temp2.right;
        }
        
        return temp.right;
            
    }
    
    class myCmp implements Comparator<TreeNode>{
        public int compare(TreeNode a,TreeNode b){
            return a.val-b.val;
        }
    }
}