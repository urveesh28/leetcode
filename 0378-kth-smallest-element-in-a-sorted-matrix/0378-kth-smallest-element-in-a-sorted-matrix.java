class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        /*ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);*/
        //using priority queue

        Queue<Integer> pq=new PriorityQueue<>((a,b)->(a-b));
        for(int[] i : matrix){
            for(int j=0;j<i.length;j++){
                pq.add(i[j]);
            }
        }

        int ans=0;
        for(int i=0;i<k;i++){
            ans=pq.remove();
        }

        return ans;
    }
}