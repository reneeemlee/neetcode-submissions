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
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        int right = maxDepth(root.right, sum + 1);
        int left = maxDepth(root.left, sum + 1);

        // the +1 accoutns for the current node, contributing to curr 
        // recursion call. 
        return 1 + Math.max(right, left);
    }
}
