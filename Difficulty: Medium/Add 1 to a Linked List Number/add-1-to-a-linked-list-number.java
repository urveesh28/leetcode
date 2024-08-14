//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        }
    }
}
// } Driver Code Ends


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
    
    private static Node reverse(Node head){
        Node prev=null ,curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
    
    public Node addOne(Node head) {
        // code here.
        int c=0;
        head=reverse(head);
        Node temp=head;
        Node newHead=null , newTail=null;
        int num=1;
         
        while(temp!=null || c!=0){
            int val=(temp==null?0:temp.data);
            int sum=val+c+num;
            num=0;
            c=sum/10;
            Node t=new Node(sum%10);
            if(newHead==null){
                newHead=newTail=t;
            }
            else{
                newTail.next=t;
                newTail=t;
            }
            temp=temp==null?null:temp.next;
        }
        
        return reverse(newHead);
    }
}
