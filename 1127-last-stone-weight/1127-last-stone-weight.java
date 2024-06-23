class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq=new PriorityQueue<>((a,b)->{
            if(a!=b){
                return b-a;
            }
            return 0;
        });

        for(int i : stones){
            pq.offer(i);
        }

        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(a!=b){
                a=a-b;
                pq.offer(a);
            }
        }

        if(pq.size()>0)return pq.poll();
        return 0;
    }
}