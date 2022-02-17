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
    public boolean isSymmetric(TreeNode root) {
        boolean res=isSameTree(root,root);
        if(res==true){
            return true;
        }
        else{
            return false;
        }
    }
    
        public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null){
            return true;
        }
        else if(p==null){
            return false;
        }
        else if(q==null){
            return false;
        }
        
        if(p.val!=q.val){
            return false;
        }
        
        boolean left= isSameTree(p.left,q.right);
        if(left==false){
            return false;
        }
        boolean right= isSameTree(p.right,q.left);
        if(right==false){
            return false;
        }
        return true;
    }
}