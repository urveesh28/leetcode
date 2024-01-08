class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<n;i++){
            int a=0;
            int b=i;
            while((a+1)<m && (b+1)<n){
                if(matrix[a][b]!=matrix[a+1][b+1])return false;
                a++;b++;
            }
        }

        for(int i=1;i<m;i++){
            int a=i;
            int b=0;
            while((a+1)<m && (b+1)<n){
                if(matrix[a][b]!=matrix[a+1][b+1])return false;
                a++;b++;
            }
        }
        return true;
    }
}