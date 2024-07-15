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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        List<Double> ans = new ArrayList();
        TreeNode abc;
        q.add(root);
        long sum = 0,count = 0;
        while(!q.isEmpty()){
            sum = 0;
            count = 0;
            Queue<TreeNode> temp = new LinkedList();
            while(!q.isEmpty()){
                abc = q.poll();
                if(abc.left!=null){
                    temp.add(abc.left);
                }
                if(abc.right!=null){
                    temp.add(abc.right);
                }
                sum += abc.val;
                count ++;
            }
            q = temp;
            ans.add(sum*1.0/count);
        }
        return ans;
    }
}