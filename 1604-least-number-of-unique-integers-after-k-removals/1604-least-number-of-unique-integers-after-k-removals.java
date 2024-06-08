class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int i : arr){
           map.put(i,map.getOrDefault(i,0)+1);
       }
      
       Queue<int[]> pq=new PriorityQueue<>((a,b)->(a[1]-b[1]));

       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(new int[]{entry.getKey(),entry.getValue()});
       }

       for(int i=0;i<k;i++){
            if(pq.peek()[1]>1){
                int[] v=pq.remove();
                v[1]=v[1]-1;
                pq.add(v);
            }
            else pq.remove();
       }

        return pq.size();
       

    }
}