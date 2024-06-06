class Solution {
    public long pickGifts(int[] gifts, int k) {
        //max-heap
        Queue<Integer> pq=new PriorityQueue<>((a,b) ->{
            return (b-a);
        });

        long sum=0;
        for(int i : gifts)pq.add(i);

        for(int i=0;i<k;i++){
            int v=pq.remove();
            pq.add((int)Math.floor(Math.sqrt(v)));
        }

        while(!pq.isEmpty()){
            sum+=pq.remove();
        }

        return sum;

    }
}