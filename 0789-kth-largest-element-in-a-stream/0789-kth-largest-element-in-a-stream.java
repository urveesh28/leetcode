class KthLargest {

    private Queue<Integer> pq;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<Integer>((a,b) -> {
            return a-b;
        });
        
        for(int i : nums){
            pq.offer(i);
        }    
        
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size()>k){
            pq.poll();
        }
        int ans=pq.peek();
        return ans;
    }
    
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */