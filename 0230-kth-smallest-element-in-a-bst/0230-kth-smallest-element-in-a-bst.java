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
    public int kthSmallest(TreeNode root, int k)throws NullPointerException {
        //using level order traversal and priority queue
        Queue<Integer> pq=new PriorityQueue<>((a,b)->(a-b));
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            pq.offer(curr.val);
            if(curr.left!=null){
                q.add(curr.left);
            }

            if(curr.right!=null){
                q.add(curr.right);
            }
        }

        int ans=0;
        while(k-->0){
            ans=pq.poll();
        }

        return ans;
    }
}