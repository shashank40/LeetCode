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
        if(root==null ||(root.left==null && root.right==null))
            return root;
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            arr.add(temp.val);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        
        Collections.sort(arr);
        int prev=0;
        int n=arr.size();
        for(int i=n-1;i>=0;i--){
            mp.put(arr.get(i),prev+arr.get(i));
            prev+=arr.get(i);
        }
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            temp.val=mp.get(temp.val);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        
        return root;
        
    }
}