// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public static boolean searchLinkedList(Node head, int x) {
        // Your code here
        Node temp=head;
        while(temp!=null){
            if(temp.data==x)return true;
            temp=temp.next;
        }
        return false;
    }
}