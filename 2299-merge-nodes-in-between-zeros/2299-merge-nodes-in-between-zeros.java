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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode newhead=null , newtail=null;
        ListNode i=head,j=head.next;
        int sum=0;
        while(j!=null){
            if(j.val>0)sum+=j.val;
            else if(j.val==0){
                ListNode temp=new ListNode(sum);
                if(newhead==null){
                    newhead=newtail=temp;
                }
                else{
                    newtail.next=temp;
                    newtail=temp;
                }

                i=j;
                sum=0;
            }
            j=j.next;
        }

        return newhead;
    }
}