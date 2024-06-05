class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length)return mat;
        int[][] ans=new int[r][c];
        int l=0;
        int[] a=new int[mat.length*mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                a[l++]=mat[i][j];
            }
        }

        l=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=a[l++];
            }
        }
        return ans;
    }
}