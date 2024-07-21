class Solution {
    public int[][] matrixBlockSum(int[][] matrix, int k) {
        
        int[][] ans=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int r=i-k;
                if(r<0)r=0;
                while(r<=i+k && r<matrix.length){
                    int c=j-k;
                    if(c<0)c=0;
                    while(c<=j+k && c<matrix[0].length){
                        ans[i][j]+=matrix[r][c];
                        c++;
                    }
                    r++;
                }
            }
        }

        return ans;
    }
}