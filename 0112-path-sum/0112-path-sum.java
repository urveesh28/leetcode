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
    
    public static boolean helper(TreeNode root,int t){
        if(root==null)return false;
        if(root.left==null && root.right==null){
            return t==root.val;
        }    
        boolean left=helper(root.left,t-root.val);
        boolean right=helper(root.right,t-root.val);
        return left||right;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        return helper(root,targetSum);   
    }
}