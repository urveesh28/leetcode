// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    
    private static ArrayList<Integer> helper(Node head){
        //forward traversing
        Node temp=head;
        
        ArrayList<Integer> arr=new ArrayList<>();
        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }
        
        return arr;
        
        
    }
    
    public static ArrayList<Integer> displayList(Node head) {
        // your code here
        return helper(head);
    }
}