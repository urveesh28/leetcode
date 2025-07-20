class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        int ans=0;

        for(int i : piles){
            pq.offer(i);
        }

        while(k-->0){
            int val=pq.poll();
            if(val%2==0){
                val=val/2;
            }
            else{
                val=(val+1)/2;
            }
            
            pq.offer(val);
        }

        while(!pq.isEmpty()){
            ans+=pq.poll();
        }

        return ans;
    }
}