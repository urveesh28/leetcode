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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> map=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }

        ListNode dummy=new ListNode(0);
        ListNode h=dummy;
        temp=head;
        while(temp!=null){
            if(map.get(temp.val)==1){
                h.next=new ListNode(temp.val);
                h=h.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}