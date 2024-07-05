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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> arr=new ArrayList<>();
        ListNode temp1=head;
        ListNode temp2=head.next;
        ListNode temp3=head.next.next;

        int pos=1;
        while(temp3!=null){
            
            //local maxima/minima
            
            if((temp1.val<temp2.val && temp2.val>temp3.val)||(temp1.val>temp2.val && temp2.val<temp3.val)){  
                arr.add(pos+1);
            }

            temp1=temp1.next;
            temp2=temp2.next;
            temp3=temp3.next;
            pos++;
        }
        
        if(arr.size()<2)return new int[]{-1,-1};
        
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++){
            min=Math.min(min,arr.get(i)-arr.get(i-1));
        }

        return new int[]{min,arr.get(arr.size()-1)-arr.get(0)};

    }
}