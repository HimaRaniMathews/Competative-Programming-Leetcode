/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    private TreeNode result;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Inorder(original,cloned,target);
        return result;
    }
    private void Inorder(TreeNode original,  TreeNode cloned, TreeNode target){
        if(original==null){
            return;
        }
            
        Inorder(original.left,cloned.left,target);
        if(original==target){
            result=cloned;
            return ;
        }
         Inorder(original.right,cloned.right,target);
        
    }
}