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
    
    public static ListNode create(Queue<Integer> q){
        ListNode head=null;
        ListNode tail=null;
        while(!q.isEmpty()){
            ListNode temp=new ListNode(q.poll());
            if(head==null){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        return head;
        
    }
    
    public ListNode sortList(ListNode head) {
        //brute force approach
        /*List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        return create(head,list);*/
        Queue<Integer> q=new PriorityQueue<>((a,b)->(a-b));
        ListNode temp=head;
        while(temp!=null){
            q.offer(temp.val);
            temp=temp.next;
        }

        return create(q);
    }
}