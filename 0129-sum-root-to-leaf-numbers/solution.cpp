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
    int solve(TreeNode* root, int ans) {
        if (root == NULL) {
            return 0;
        }
        ans = (ans * 10) + root->val;
        if (root->left == NULL && root->right == NULL) {
            return ans;
        }
        return solve(root->left, ans) + solve(root->right, ans);
    }
    int sumNumbers(TreeNode* root) {
        return solve(root, 0);
    }
};
