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
class BSTIterator {
    ArrayList<TreeNode> arr=new ArrayList<>();
    int i;
    public BSTIterator(TreeNode root) {
        fill(root);
        i=-1;
    }
    
    public int next() {
    i++;
    return arr.get(i).val;
    }
    
    public boolean hasNext() {
        return (i+1<arr.size());
    }
    public void fill(TreeNode root){
        if(root==null)
            return;
        
        fill(root.left);
        arr.add(root);
        fill(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */