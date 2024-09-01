class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int n=queries.length;
        int[] res=new int[n];
        
        //maxheap bana lo of size k
        //agar heap ka top ele < dist then add
        //agar heap ka top ele > dist then remove top and add dist
        //set res
        
        Queue<Integer> maxHeap=new PriorityQueue<>((a,b)->(b-a));
        
        int j=0;
        for(int[] i : queries){
            int dist=Math.abs(i[0])+Math.abs(i[1]);
            
            if(maxHeap.size()<k){
                maxHeap.offer(dist);
            }
            else{
                if(dist<maxHeap.peek()){
                    maxHeap.remove();
                    maxHeap.offer(dist);
                }
            }

            if(maxHeap.size()<k){
                res[j]=-1;
            }

            else{
                res[j]=maxHeap.peek();
            }
            j++;
        }

        return res;
    }
}