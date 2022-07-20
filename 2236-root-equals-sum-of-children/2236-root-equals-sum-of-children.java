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
    public boolean checkTree(TreeNode root) {
        int a=0,b=0;
        if(root.left!=null){
            a=root.left.val;
        }
         if(root.right!=null){
            b=root.right.val;
        }
        if((a+b)==root.val){
            return true;
        }
            return false;
        
    }
}