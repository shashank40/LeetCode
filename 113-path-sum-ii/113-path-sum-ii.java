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
    List<List<Integer>> arr;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        arr = new ArrayList<>();
        if(root == null)
            return arr;
        List<Integer> a = new ArrayList<>();
        answer(root,0,targetSum,a);
        return arr;
    }
    
    public void answer(TreeNode root, int curr, int tsum,List<Integer> a){
        if(root.left == null && root.right==null){
            curr+=root.val;
            a.add(root.val);
            if(curr==tsum){
                arr.add(new ArrayList<Integer>());
                for(int x: a)
                    arr.get(arr.size()-1).add(x);
            }
            a.remove(a.size()-1);
            curr-=root.val;
            return;
        }
        
        curr+=root.val;
        a.add(root.val);
        if(root.left!=null)
        answer(root.left,curr,tsum,a);
        if(root.right!=null)
        answer(root.right,curr,tsum,a);
        a.remove(a.size()-1);
        curr-=root.val;
    }
    
}