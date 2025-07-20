/* Node is defined as
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // code here
        Node slow,fast;
        slow=fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        
        return false;
    }
}