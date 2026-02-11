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
        List<Integer>l=new ArrayList<>();
        c(root,l);
        return l;
    }
    void c(TreeNode root,List<Integer> l){
        if(root==null)return;
        l.add(root.val);
        c(root.left,l);
        c(root.right,l);
    }
}