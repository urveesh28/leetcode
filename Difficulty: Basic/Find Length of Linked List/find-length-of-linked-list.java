/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        int l=0;
        while(head!=null){
            head=head.next;
            l++;
        }
        
        return l;
    }
}