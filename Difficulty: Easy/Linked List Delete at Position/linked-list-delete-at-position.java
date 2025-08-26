// User function Template for Java

/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Delete {
    Node deleteAtPosition(Node head, int pos) {
        // your code here
        if(pos==1){
            head=head.next;
            return head;
        }
        
        Node temp=head;
        pos=pos-2;
        while(pos-->0){
            temp=temp.next;
        }
        
        temp.next=temp.next.next;
        return head;
    }
}
