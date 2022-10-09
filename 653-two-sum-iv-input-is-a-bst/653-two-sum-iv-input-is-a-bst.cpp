class Solution {
public:
    vector<int> ar;
    void inorder(TreeNode* root, vector<int> &ar)
    {
        if(!root)
            return;
        inorder(root->left, ar);
        ar.push_back(root->val);
        inorder(root->right, ar);                                      
    }
    bool findTarget(TreeNode* root, int k) 
    {
        inorder(root, ar);
        int i=0, j=ar.size()-1;
        while(i<j)
        {
            int sum = ar[i]+ar[j];
            if(sum==k)
                return true;
            else if(sum<k)
                i++;
            else
                j--;
        }
        return false;
    }
};