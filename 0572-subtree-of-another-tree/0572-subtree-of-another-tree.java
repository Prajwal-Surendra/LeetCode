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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null)
            return true;
        if(root==null)
            return false;
        if(sameTree(root,subRoot))
            return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    boolean sameTree(TreeNode s,TreeNode t)
    {
        if(s==null && t==null)
            return true;
        if(s!=null && t!=null && s.val==t.val)
            return sameTree(s.left,t.left) && sameTree(s.right,t.right);
        return false;
    }
}