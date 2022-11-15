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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return count(root);
    }
    
    public int count(TreeNode root){
        if(root.left == null && root.right == null){
            return 1;
        }
        int lcount=0,rcount=0;
        if(root.left!=null ){
            lcount = count(root.left);   
        }
        if(root.right!=null){
            rcount = count(root.right);
        }
        return  lcount+rcount+1;
    }
}