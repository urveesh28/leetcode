/*
The structure of node class is :
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public Node[] mergeList(Node head1, Node head2) {
        // write your code here, and print the result
        Node[] ans=new Node[2];
        Node temp1=head1;
        Node temp=null;
        
        while(temp1!=null && head2!=null){
            temp=temp1.next;
            temp1.next=head2;
            head2=head2.next;
            temp1.next.next=temp;
            temp1=temp;
        }
        
        ans[0]=head1;
        ans[1]=head2;
        return ans;
    }
}