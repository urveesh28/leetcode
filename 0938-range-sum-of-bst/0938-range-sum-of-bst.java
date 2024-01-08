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
    public static void Inorder(TreeNode root,int low,int high,List<Integer> list){
        if(root==null){
            return; 
        }
        if(root.val>=low && root.val<=high)list.add(root.val);
        Inorder(root.left,low,high,list);
        Inorder(root.right,low,high,list);
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> list=new ArrayList<>();
        Inorder(root,low,high,list);
        int sum=0;
        for(int i=0;i<list.size();i++)sum+=list.get(i);
        return sum;
    }
}