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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        ListNode t=new ListNode(0);
        t.next=head;
        head=t;

        Set<Integer> set=new HashSet<>();
        for(int i : nums){
            set.add(i);
        }


        t=head;
        ListNode prev=null;
        while(t!=null){
            if(set.contains(t.val)){
                //delete
                prev.next=t.next;
                t=t.next;
            }
            else{
                prev=t;
                t=t.next;
            }
        }

        head=head.next;
        return head;
    }
}