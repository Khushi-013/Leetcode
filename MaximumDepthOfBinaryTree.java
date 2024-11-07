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
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // If there's no left child, we only consider the right subtree
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }

        // If there's no right child, we only consider the left subtree
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }

        // If both children are present, find the minimum depth of both subtrees
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
