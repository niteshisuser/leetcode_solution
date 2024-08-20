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
    boolean inorder(TreeNode root,int key){
        if(root!=null){
            boolean leftResult= inorder(root.left,key);
            if(!leftResult) return false;
            if(root.val!=key) return false;
            return inorder(root.right,key);
        }
        return true;
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        int key = root.val;
        return inorder(root,key);
    }
}