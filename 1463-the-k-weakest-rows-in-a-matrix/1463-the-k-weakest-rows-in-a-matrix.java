
class Solution {
    
    public static int count(int[] mat){
        int s=0;
        for(int i : mat){
            s+=i;
        }
        return s;
    }
    
    public int[] kWeakestRows(int[][] mat, int k) {
        
        Map<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[k];
        //min-heap
        Queue<int[]> pq=new PriorityQueue<>((a,b) -> {
            if(a[1]!=b[1]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });

        for(int i=0;i<mat.length;i++){
            int s=count(mat[i]);
            map.put(i,s);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(new int[]{entry.getKey(),entry.getValue()});
        }

        int c=0;
        while(k-->0){
            ans[c++]=pq.poll()[0];
        }

        return ans;
    }
}