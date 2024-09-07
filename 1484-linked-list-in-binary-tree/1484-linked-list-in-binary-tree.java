/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    
    private static boolean helper(ListNode head,ListNode curr,TreeNode root){
        if(curr==null){
            return true;
        }

        if(root==null){
            return false;
        }

        if(curr.val==root.val){
            curr=curr.next;
        }

        else if(head.val==root.val){
            head=head.next;
        }

        else{
            curr=head;
        }

        return helper(head,curr,root.left)||helper(head,curr,root.right);
    }
    
    public boolean isSubPath(ListNode head, TreeNode root) {
        return helper(head,head,root);
    }
}