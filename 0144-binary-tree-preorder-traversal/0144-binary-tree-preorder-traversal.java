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
    public List<Integer> preorderTraversal(TreeNode root) {
        //iterative preordertraversal
        //stack is used and values are pushed - root,right,left
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> stk=new Stack<>();
        stk.push(root);

        while(!stk.isEmpty()){
            TreeNode temp=stk.pop();
            ans.add(temp.val);

            //add adjacency
            if(temp.right!=null){
                stk.push(temp.right);
            }

            if(temp.left!=null){
                stk.push(temp.left);
            }
        }

        return ans;


    }
}