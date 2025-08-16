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
    ArrayList<Integer> list=new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left==null){
                list.add(curr.val);
                curr=curr.right;
            }else{
                TreeNode precedor=curr.left;
                while(precedor.right!=null && precedor.right!=curr){
                    precedor=precedor.right;
                }

                if(precedor.right==null){
                    precedor.right=curr;
                    curr=curr.left;
                }else{
                    precedor.right=null;
                    list.add(curr.val);
                    curr=curr.right;
                }
            }
        }
        return list;
    }
}