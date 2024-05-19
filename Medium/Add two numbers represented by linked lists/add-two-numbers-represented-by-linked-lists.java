//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node num1 = new Node(val);
            Node tail = num1;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node num2 = new Node(val);
            tail = num2;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    
    public static Node reverse(Node h){
        Node c=h ,p=null;
        while(c!=null){
            Node n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    
    
    static Node addTwoLists(Node num1, Node num2){
        // code here
        // return head of sum list
        int carry=0;
        num1=reverse(num1);
        num2=reverse(num2);
        //System.out.println(num1.data+"  ------  "+num2.data);
        
        Node newHead=null , newTail=null;
        while(num1!=null || num2!=null || carry!=0){
            int a=(num1!=null)?num1.data:0;
            int b=(num2!=null)?num2.data:0;
            
            int sum=carry+a+b;
            carry=sum/10;
            Node t=new Node(sum%10);
            if(newHead==null){
                newHead=newTail=t;
            }
            else{
                newTail.next=t;
                newTail=t;
            }
            
            num1=(num1!=null)?num1.next:null;
            num2=(num2!=null)?num2.next:null;
        }
        newHead=reverse(newHead);
        while(newHead.next!=null && newHead.data==0){
            newHead=newHead.next;
        }
        return newHead;
    }
}