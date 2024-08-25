class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        List<int[]> arr=new ArrayList<>();
        int ans=0;

        for(int i=0;i<profits.length;i++){
            arr.add(new int[]{capital[i],profits[i]});
        }

        //sort based on the capital of projects
        Collections.sort(arr,(a,b)->(a[0]-b[0]));

        //max-heap
        Queue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));

        int j=0;
        for(int i=0;i<k;i++){
            
            //add to heap till budget >= to capital of projects
            while(j<profits.length && w>=arr.get(j)[0]){
                pq.offer(arr.get(j)[1]);
                j++;
            }

            if(pq.size()==0){
                break;
            }

            //add max profit to budget
            w+=pq.poll();
        }

        return w;
    }
}