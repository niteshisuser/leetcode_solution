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
    public List<String> binaryTreePaths(final TreeNode root) {
        final List<String> result = new ArrayList<>();

        helper(result, new StringBuilder(), root);

        return result;
    }

    private void helper(final List<String> result, final StringBuilder sb, final TreeNode root) {
        final int tmp = sb.length();

        if(root.left == null && root.right == null) {
            sb.append(root.val);
            result.add(sb.toString());
        } else {
            sb.append(root.val);
            sb.append("->");

            if(root.right != null)
                helper(result, sb, root.right);

            if(root.left != null)
                helper(result, sb, root.left);
        }

        sb.setLength(sb.length() - (sb.length() - tmp));
    }
}