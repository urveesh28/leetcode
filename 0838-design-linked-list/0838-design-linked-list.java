class Node{
    int data;
    int size;
    Node next;
    Node head=null , tail=null;

    public Node(){
        this.next=null;
    }

    public Node(int data){
        this.data=data;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

class MyLinkedList {

    Node obj;
    public MyLinkedList() {
        obj=new Node();
        obj.size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=obj.size || obj.head==null)return -1;
        else if(index==0)return obj.head.data;
        else if(index==obj.size-1){
            return obj.tail.data;
        }
        Node temp=obj.head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        if(obj.size==0 || obj.head==null){
            obj.head=obj.tail=temp;
        }
        else{
            temp.next=obj.head;
            obj.head=temp;
        }
        obj.size++;
    }
    
    public void addAtTail(int val) {
        Node temp=new Node(val);
        if(obj.size==0 || obj.head==null){
            obj.head=obj.tail=temp;
        }
        else{
            obj.tail.next=temp;
            obj.tail=temp;
        }
        obj.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>obj.size || index<0){
            return;
        }
        else if(index==0){
            Node temp=new Node(val);
            temp.next=obj.head;
            obj.head=temp;
            obj.size++;
        }
        else if(index==obj.size){
            Node temp=new Node(val);
            obj.tail.next=temp;
            obj.tail=temp;
            obj.size++;
        }
        else{
            Node temp1=new Node(val);
            Node temp2=obj.head;
            for(int i=0;i<index-1;i++){
                temp2=temp2.next;
            }
            temp1.next=temp2.next;
            temp2.next=temp1;
            obj.size++;
        }
        

    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=obj.size || obj.head==null){
            return;
        }
        else if(index==0){
            obj.head=obj.head.next;
            obj.size--;
        }
        else if(index==obj.size-1){
            Node temp=obj.head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            obj.tail=temp;
            obj.size--;
        }
        else{
            Node temp=obj.head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }

            temp.next=temp.next.next;
            obj.size--;
        }

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */