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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> eleList=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null){
            return eleList;
        }
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> ele=new ArrayList<Integer>();
            int num=q.size();
            for(int i=0;i<num;i++){
                TreeNode x=q.poll();
                ele.add(x.val);
                if(x.left!=null){
                    q.offer(x.left);
                }
                if(x.right!=null){
                    q.offer(x.right);
                }
            }
            eleList.add(ele);
        }
        return eleList;
    }
}