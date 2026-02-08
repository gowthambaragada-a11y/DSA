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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l=new LinkedList<>();
        con(root,l);
        return l;
    }
    static void con(TreeNode root,List<Integer>a){
        if(root==null)return;
        con(root.left,a);
        a.add(root.val);
        con(root.right,a);
    }
}