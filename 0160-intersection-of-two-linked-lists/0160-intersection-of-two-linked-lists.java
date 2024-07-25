/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //approach iterate over the lists
        //if any pointer reaches null set -> to its head

        //for egde cases
        if(headA==null || headB==null)return null;

        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=temp2){
            temp1=(temp1==null)?headA:temp1.next;
            temp2=(temp2==null)?headB:temp2.next;
        }

        return temp1;
    }
}