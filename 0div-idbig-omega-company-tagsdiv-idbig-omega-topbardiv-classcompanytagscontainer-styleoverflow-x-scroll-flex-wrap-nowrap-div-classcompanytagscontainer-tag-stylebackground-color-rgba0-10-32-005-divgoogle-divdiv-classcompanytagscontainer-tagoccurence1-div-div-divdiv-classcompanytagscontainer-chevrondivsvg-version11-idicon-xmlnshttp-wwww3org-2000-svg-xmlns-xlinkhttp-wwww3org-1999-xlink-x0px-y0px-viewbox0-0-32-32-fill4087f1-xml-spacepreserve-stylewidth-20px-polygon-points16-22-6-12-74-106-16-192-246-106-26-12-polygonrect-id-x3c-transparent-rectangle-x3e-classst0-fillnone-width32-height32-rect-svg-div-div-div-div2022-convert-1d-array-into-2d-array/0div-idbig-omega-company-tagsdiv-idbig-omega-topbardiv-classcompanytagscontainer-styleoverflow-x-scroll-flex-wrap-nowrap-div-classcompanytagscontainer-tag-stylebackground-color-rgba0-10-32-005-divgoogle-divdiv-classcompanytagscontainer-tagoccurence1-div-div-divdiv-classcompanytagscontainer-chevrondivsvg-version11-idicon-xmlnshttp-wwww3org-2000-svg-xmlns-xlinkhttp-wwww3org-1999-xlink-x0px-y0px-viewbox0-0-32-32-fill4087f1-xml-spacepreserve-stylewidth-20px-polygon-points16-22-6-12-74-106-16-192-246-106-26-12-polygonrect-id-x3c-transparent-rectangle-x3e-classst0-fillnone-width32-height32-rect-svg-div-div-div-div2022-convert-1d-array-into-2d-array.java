class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length > m*n || original.length < m*n)return new int[][]{};
        int[][] arr=new int[m][n];
        int rows=0;
        int i=0;
        while(rows<m){
            int cols=0;
            while(cols<n && i<original.length){
                arr[rows][cols]=original[i++];
                cols++;
            }
            rows++;
        
        }
        return arr;
    }
}