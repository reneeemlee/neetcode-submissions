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
    public int diameterOfBinaryTree(TreeNode root) {
        // DFS algo: at each node subtrees return respective heights
            // leftHeight + rightHeight
            // calculate diameter at node: d = leftHeigh + rightHeight
            // global var that yuo update to max diameter
        int[] res = new int[1];
        diameterOfBinaryTree(root, res);
        return res[0];
    }

    private int diameterOfBinaryTree(TreeNode root, int[] res) {
        // empty case
        if (root == null) {
            return 0;
        }

        // compute height of left subtree
        int left = diameterOfBinaryTree(root.left, res);

        // compute height of right subtree
        int right = diameterOfBinaryTree(root.right, res);

        // compute diameter through node = leftHeight + rightHeight
        res[0] = Math.max(res[0], left + right);
        
        // recursively find diameter of left subtree
        // recurisvely find diameter of right subtree

        // final diameter of node is max of
            // diameter thru this node, diameter of left subtree, diameter of right subtree

        // return maximum
        return 1 + Math.max(left, right);
    }
}
