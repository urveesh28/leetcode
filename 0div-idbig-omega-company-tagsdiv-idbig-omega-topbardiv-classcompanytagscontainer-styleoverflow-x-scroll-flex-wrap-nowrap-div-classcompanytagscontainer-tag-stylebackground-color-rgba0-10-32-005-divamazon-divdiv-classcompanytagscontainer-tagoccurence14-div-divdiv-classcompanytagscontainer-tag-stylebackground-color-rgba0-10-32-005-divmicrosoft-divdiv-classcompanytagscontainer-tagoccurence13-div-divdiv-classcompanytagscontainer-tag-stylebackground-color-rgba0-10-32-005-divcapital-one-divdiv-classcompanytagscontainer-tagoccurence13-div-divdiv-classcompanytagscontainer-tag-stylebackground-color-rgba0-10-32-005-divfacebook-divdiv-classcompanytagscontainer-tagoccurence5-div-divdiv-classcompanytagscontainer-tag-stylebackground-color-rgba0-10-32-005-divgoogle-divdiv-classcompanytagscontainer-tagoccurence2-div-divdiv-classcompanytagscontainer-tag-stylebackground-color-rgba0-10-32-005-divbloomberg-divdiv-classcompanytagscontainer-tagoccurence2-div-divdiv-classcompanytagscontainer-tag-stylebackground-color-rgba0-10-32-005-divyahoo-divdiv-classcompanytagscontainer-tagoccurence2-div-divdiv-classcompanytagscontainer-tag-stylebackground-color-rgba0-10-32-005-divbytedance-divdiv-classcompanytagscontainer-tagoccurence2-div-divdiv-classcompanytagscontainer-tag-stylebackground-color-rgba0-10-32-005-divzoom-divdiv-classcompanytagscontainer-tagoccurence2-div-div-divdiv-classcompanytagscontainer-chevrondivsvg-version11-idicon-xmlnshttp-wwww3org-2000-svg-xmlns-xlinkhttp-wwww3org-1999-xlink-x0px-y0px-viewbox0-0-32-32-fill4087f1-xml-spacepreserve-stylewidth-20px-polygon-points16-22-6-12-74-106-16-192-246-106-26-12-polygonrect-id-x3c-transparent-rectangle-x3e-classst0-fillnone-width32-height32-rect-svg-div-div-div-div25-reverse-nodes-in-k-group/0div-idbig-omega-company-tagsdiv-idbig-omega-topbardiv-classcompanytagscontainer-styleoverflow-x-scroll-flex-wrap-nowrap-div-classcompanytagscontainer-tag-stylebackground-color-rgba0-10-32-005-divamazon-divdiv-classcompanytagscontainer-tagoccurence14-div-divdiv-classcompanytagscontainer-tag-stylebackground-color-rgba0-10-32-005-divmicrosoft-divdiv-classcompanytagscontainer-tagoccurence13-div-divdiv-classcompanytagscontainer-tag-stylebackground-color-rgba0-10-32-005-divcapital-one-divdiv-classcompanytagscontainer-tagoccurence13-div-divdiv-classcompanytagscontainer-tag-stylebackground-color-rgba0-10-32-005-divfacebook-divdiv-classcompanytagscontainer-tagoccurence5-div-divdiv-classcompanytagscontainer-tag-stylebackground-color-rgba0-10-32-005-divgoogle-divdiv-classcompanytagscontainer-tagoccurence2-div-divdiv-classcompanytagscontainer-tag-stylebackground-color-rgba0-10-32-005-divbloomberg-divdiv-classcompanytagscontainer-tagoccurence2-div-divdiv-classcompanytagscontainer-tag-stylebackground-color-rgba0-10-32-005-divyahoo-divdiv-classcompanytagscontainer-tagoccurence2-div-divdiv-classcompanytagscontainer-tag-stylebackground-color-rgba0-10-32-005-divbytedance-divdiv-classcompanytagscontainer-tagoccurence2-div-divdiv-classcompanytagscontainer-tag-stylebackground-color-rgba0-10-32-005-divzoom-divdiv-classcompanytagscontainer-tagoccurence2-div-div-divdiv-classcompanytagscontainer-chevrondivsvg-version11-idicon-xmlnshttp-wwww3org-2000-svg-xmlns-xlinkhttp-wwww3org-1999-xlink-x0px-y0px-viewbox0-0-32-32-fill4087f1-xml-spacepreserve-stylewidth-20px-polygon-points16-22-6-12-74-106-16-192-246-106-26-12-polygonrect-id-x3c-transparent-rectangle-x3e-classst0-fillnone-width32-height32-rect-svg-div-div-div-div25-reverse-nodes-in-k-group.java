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
    
    public static ListNode create(List<Integer> list){
        ListNode head=null;
        ListNode tail=null;
        int i=0;
        while(i<list.size()){
            ListNode temp=new ListNode(list.get(i));
            if(head==null){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            i++;
        }
        return head;
    }
    
    public static void reverse(List<Integer> list,int start,int end){
        while(start<end){
            int temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        //Jugadu Approach :))
        ListNode temp=head;
        List<Integer> list=new ArrayList<>();
        
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        for(int i=0;i<list.size();i+=k){
            int index1=i;
            int index2=i+k-1;
            if(index1<list.size() && index2<list.size()){
                reverse(list,index1,index2);
            }
        }

        return create(list);
    }
}