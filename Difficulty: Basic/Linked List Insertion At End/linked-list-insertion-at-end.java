/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        if(head==null){
            head=new Node(x);
            return head;
        }
        if(head.next==null){
            head.next=new Node(x);
            return head;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=new Node(x);
        return head;
    }
}