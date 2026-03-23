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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();

        solve(root,ll);

        return ll;
    }

    void solve(TreeNode root, List<Integer> ll){
        if(root==null) return;

        ll.add(root.val);

        solve(root.left,ll);

        solve(root.right,ll);
    }
}