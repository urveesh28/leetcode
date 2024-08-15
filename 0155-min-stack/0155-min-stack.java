class MinStack {
    //implementing using 2 stacks
    
    private Stack<Integer> minStk;
    private Stack<Integer> stk;

    public MinStack() {
        stk=new Stack<>();
        minStk=new Stack<>();
    }
    
    public void push(int val) {
        //monotonic stack
        if(minStk.isEmpty() || val<=minStk.peek()){
            minStk.push(val);
        }
        stk.push(val);
        
    }
    
    public void pop() {
        if(stk.peek().equals(minStk.peek())){
            minStk.pop();
        }

        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */