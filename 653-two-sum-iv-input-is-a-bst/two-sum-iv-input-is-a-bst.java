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
    List<Integer> list = new ArrayList();
    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int start = 0;
        int end = list.size()-1;
        int sum = 0;
        while(start<end){
            sum = list.get(start) + list.get(end);
            if(sum == k) return true;
            if(sum >k) end--;
            else start++;
        }
        return false;
    }
}