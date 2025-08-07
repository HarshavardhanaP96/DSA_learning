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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean level=true;
        List<List<Integer>> zigzag=new ArrayList<List<Integer>>();
        if(root!=null) zigzagans(root,zigzag,level);
        return zigzag;
    }
    void zigzagans(TreeNode root,List<List<Integer>> zigzag,boolean level){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            LinkedList<Integer> arr=new LinkedList<Integer>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode r=q.remove();
                if(level){
                    arr.add(r.val);
                }else{
                    arr.addFirst(r.val);
                }
                    if(r.left!=null) q.add(r.left);
                    if(r.right!=null) q.add(r.right);
            }
            level=!level;
            zigzag.add(arr);
        }
    }
}