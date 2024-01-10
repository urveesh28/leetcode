class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans=new int[2];
        int onecount=0;
        int row=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                count+=mat[i][j];
            }
            if(onecount<count){
                onecount=count;
                row=i;
            }
        }
        return new int[]{row,onecount};
    }
}