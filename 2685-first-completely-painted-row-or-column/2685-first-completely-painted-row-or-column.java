class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int[] rows=new int[mat.length];
        int[] cols=new int[mat[0].length];

        Map<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }

        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            int[] v=map.get(k);
    
            rows[v[0]]++;
            cols[v[1]]++;
            
            if(rows[v[0]]==mat[0].length){
                return i;
            }

            if(cols[v[1]]==mat.length){
                return i;
            }
        }

        return arr.length;
    }
}