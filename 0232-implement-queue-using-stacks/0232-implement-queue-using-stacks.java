class MyQueue {

    //using 2 stacks
    Stack<Integer> stk1;
    Stack<Integer> stk2;
    public MyQueue() {
        stk1=new Stack<Integer>();
        stk2=new Stack<Integer>();
    }
    
    public void push(int x) {
        
        //simply add all elements to stack1
        stk1.add(x);
    }
    
    public int pop() {
        int n=stk1.size();
        
        //add size-1 elements to stack2
        while(n-->1){
            stk2.add(stk1.pop());
        }

        //store the top-most value
        int val=stk1.pop();

        n=stk2.size();

        //add back elements to stack1
        while(n-->0){
            stk1.add(stk2.pop());
        }

        return val;
    }
    
    public int peek() {
        
        //same as in pop() method 
        int n=stk1.size();
        while(n-->1){
            stk2.add(stk1.pop());
        }
        int val=stk1.peek();

        n=stk2.size();
        while(n-->0){
            stk1.add(stk2.pop());
        }
        
        return val;
    }
    
    public boolean empty() {
        return stk1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */