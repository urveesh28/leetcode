//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    Node head = null, tail = null;
		    
		    char head_c = sc.next().charAt(0);
		    head = new Node(head_c);
		    tail = head;
		    
		    while(n-- > 1){
		        tail.next = new Node(sc.next().charAt(0));
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    //show(head);
		    show(obj.arrangeCV(head));
		    
		}
	}
	
	public static void po(Object o){
	    System.out.println(o);
	}
	
	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*
Structure of node class is:
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    
    public static Node helper1(Node head){
        Node temp=head;
        Node newHead1=null;
        Node newTail1=null;
        Node newHead2=null;
        Node newTail2=null;
        while(temp!=null){
            if(temp.data=='a' || temp.data=='e' || temp.data=='i' || temp.data=='o' || temp.data=='u'){
                Node temp2=new Node(temp.data);
                if(newHead1==null){
                    newHead1=newTail1=temp2;
                }
                else{
                    newTail1.next=temp2;
                    newTail1=temp2;
                }
            }
            else{
                Node temp3=new Node(temp.data);
                if(newHead2==null){
                    newHead2=newTail2=temp3;
                }
                else{
                    newTail2.next=temp3;
                    newTail2=temp3;
                }
            }
            temp=temp.next;
        }
        
        if(newHead1==null)return newHead2;
        newTail1.next=newHead2;
        return newHead1;
    }
    
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        return helper1(head);
    }
}