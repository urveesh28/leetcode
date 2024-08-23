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
    
    private static int helper(TreeNode root){
        //using level order traversal
        int maxSum=Integer.MIN_VALUE;
        int maxLevel=1;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            while(size-->0){
                TreeNode curr=q.poll();
                sum+=curr.val;

                if(curr.left!=null){
                    q.offer(curr.left);
                }

                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }

            System.out.println(sum);
            if(maxSum<sum){
                maxSum=sum;
                maxLevel=level;
            }
            level++;
        }

        return maxLevel;
    } 
    
    public int maxLevelSum(TreeNode root) {
        return helper(root);
    }
}