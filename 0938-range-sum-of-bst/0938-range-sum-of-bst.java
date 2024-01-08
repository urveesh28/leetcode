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
    public static int Inorder(TreeNode root,int low,int high){
        if(root==null){
            return 0; 
        }
        int curr=(root.val>=low && root.val<=high)?root.val:0;
        int lsum=Inorder(root.left,low,high);
        int rsum=Inorder(root.right,low,high);
        return lsum+rsum+curr;
        
        
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        return Inorder(root,low,high);
    }
}