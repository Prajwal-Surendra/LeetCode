# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def dfs(root):
            if not root:
                return 0
            ltree, rtree = dfs(root.left), dfs(root.right)
            if ltree == -1 or rtree == -1 or abs(ltree - rtree)>1:
                return -1
            return max(ltree,rtree) + 1
        return dfs(root)!= -1