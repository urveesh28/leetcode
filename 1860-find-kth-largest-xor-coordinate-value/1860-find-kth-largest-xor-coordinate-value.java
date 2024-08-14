class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int[][] prefix=new int[matrix.length][matrix[0].length];
        int ans=0;
        Queue<Integer> q=new PriorityQueue<>((a,b)->(b-a));
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0 && j==0){
                    prefix[i][j]=matrix[i][j];
                }
                else if(i==0){
                    //left
                    prefix[i][j]=prefix[i][j-1]^matrix[i][j];
                }
                else if(j==0){
                    //top
                    prefix[i][j]=prefix[i-1][j]^matrix[i][j];
                }
                else{
                    //top,left,top-corner,currElement
                    prefix[i][j]=prefix[i-1][j]^prefix[i][j-1]^prefix[i-1][j-1]^matrix[i][j];
                }
                q.offer(prefix[i][j]);
                
            }
        }

        while(k-->0){
            ans=q.poll();
        }
        return ans;
    }
}