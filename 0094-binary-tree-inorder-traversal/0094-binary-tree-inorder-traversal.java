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
    public List<Integer> inorderTraversal(TreeNode root) {
        //iterative inorder traversal
        //using stack - add root to stack , then move left
        //if left==null and stack not empty pop value 
        //then move to right
        
        if(root==null){
            return new ArrayList<>();
        }

        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> stk=new Stack<>();
        
        while(true){
            if(root!=null){
                stk.push(root);
                root=root.left;
            }
            else{
                if(stk.isEmpty()){
                    break;
                }
                root=stk.pop();
                ans.add(root.val);
                root=root.right;
            }
        }

        return ans;
    }
}