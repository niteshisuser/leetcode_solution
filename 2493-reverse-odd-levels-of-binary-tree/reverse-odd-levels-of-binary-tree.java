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
    static void preorder(TreeNode root1, 
                       TreeNode root2, int lvl)
    {
        // Base cases
        if (root1 == null || root2 == null)
            return;
 
        // Swap subtrees if level is even
        if (lvl % 2 == 0) {
            int t = root1.val;
            root1.val = root2.val;
            root2.val = t;
        }
 
         
        preorder(root1.left, root2.right, 
                                  lvl + 1);
        preorder(root1.right, root2.left, 
                                    lvl + 1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null) return root;
        preorder(root.left,root.right,0);
        return root;
    }
}