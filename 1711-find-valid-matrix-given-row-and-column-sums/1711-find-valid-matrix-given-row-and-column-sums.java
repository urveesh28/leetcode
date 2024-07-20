class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        //find x = min(rowsum,colsum)
        //set ans[i][j]=x ans rowsum-=x , colsum-=x
        //repeat
        
        int m=rowSum.length;
        int n=colSum.length;
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int x=Math.min(rowSum[i],colSum[j]);
                ans[i][j]=x;
                rowSum[i]-=x;
                colSum[j]-=x;
            }
        }

        return ans;
    }
}