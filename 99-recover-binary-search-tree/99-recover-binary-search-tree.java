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
    ArrayList<TreeNode> arr=new ArrayList<>();
    public void recoverTree(TreeNode root) {
        fill(root);
        int fault1=-1;
        int fault2=-1;
        int n=arr.size();
        int prev=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr.get(i).val>=prev){
                prev=arr.get(i).val;
            }
            else if(fault1==-1){
                fault1=i; 
            prev=arr.get(i).val;}
            else
                fault2=i;
        }
        
        //only two swaped, to exchange krenge to imagine case 1 : when wrong are far and case2: wrong are adjacent
        
        if(fault2==-1){
            fault2=fault1-1;
        }
        else
            fault1--;
        
        
        prev=arr.get(fault1).val;
        arr.get(fault1).val=arr.get(fault2).val;
        arr.get(fault2).val=prev;
        
    }
    
    public void fill(TreeNode root){
        if(root==null)
            return;
           /////////// PROPERTY USED : INORDER IS ALWAYS IN INCREASING ORDER FOR BST
        fill(root.left);
        arr.add(root);
        fill(root.right);
    }
    
}