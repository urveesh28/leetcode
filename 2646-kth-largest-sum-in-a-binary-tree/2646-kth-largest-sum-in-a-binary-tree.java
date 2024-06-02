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

class Checker implements Comparator<Long>{
    @Override 
    public int compare(Long a,Long b){
        if(a>b)return -1;
        else if(a<b)return 1;
        else return 0;
    }
} 
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        //max-heap
        Queue<Long> pq=new PriorityQueue<Long>(new Checker());

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            long sum=0;
            level++;
            while(size-->0){
                TreeNode curr=q.remove();
                sum+=curr.val;

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            pq.add(sum);
        }

        long ans=-1;
        if(level<k)return ans;
        while(k-->0){
            ans=pq.remove();
        }

        return ans;
    }
}