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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        TreeNode temp  = root;
        if(root == null) return list;
        Queue<TreeNode> q =  new LinkedList<>();
        q.add(temp);
        boolean isRoot = true;
        while(true){
            int s = q.size();
            if(s==0) break;
            List<Integer> l = new ArrayList<>();
            while(s>0){
                temp = q.poll();
                l.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                s --;
            }
            list.add(0,l);            
        }
        return list;
    }
}