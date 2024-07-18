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
    
    public List<Integer> rightSideView(TreeNode root) {
        
        //simple logic used
        //use level order traversal
        //take another loop inside the while loop 
        //at pos==n-1 gives the right sided Node
        //add that node to List
        List<Integer> ans=new ArrayList<>();
        
        //edge case
        if(root==null){
            return ans;
        }

        //level order traversal
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                
                TreeNode curr=q.poll();
                
                //condition for right view
                if(i==s-1){
                    ans.add(curr.val);
                }

                //adjacency
                if(curr.left!=null){
                    q.offer(curr.left);
                }

                if(curr.right!=null){
                    q.offer(curr.right); 
                }
            }
        }
        
        return ans;
    }
}