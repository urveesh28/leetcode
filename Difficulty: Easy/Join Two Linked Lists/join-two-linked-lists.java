/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node joinTheLists(Node head1, Node head2) {
        // code here
        if(head1.next==null){
            head1.next=head2;
            return head1;
        }
        
        Node tail1=head1;
        while(tail1.next!=null){
            tail1=tail1.next;
        }
        tail1.next=head2;
        return head1;
    }
}
