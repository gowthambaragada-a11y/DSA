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
    int a,c=0;
    public int kthSmallest(TreeNode root, int k) {
        p(root,k);
        return a;
    }
    void p(TreeNode root,int k){
        if(root==null)return;
        p(root.left,k);
        c++;
        if(k==c){
            a=root.val;
            return;
        }
        p(root.right,k);
    }
}