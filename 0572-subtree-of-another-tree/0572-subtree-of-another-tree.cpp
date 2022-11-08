/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
        
        if(root == NULL && subRoot == NULL)
            return true;
        else if (root == NULL && subRoot != NULL)
            return false;
        else if (root != NULL && subRoot == NULL)
            return false;


        if(root->val == subRoot->val)
            return (isIdentical(root->left, subRoot->left) && isIdentical(root->right, subRoot->right)) || isSubtree(root->left, subRoot) || isSubtree(root->right, subRoot);
        else
            return isSubtree(root->left, subRoot) || isSubtree(root->right, subRoot);

    }
private:
    bool isIdentical(TreeNode* root, TreeNode* head) {
        if(root == NULL && head == NULL)
            return true;
        else if(root == NULL && head != NULL)
            return false;
        else if(root != NULL && head == NULL)
            return false;
        
        if(root->val == head->val)
            return isIdentical(root->left, head->left) && isIdentical(root->right, head->right);
        else
            return false;

    }
};