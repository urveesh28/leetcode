class Solution {
    public int minimumArea(int[][] grid) {
        int left=Integer.MAX_VALUE;
        int right=0;

        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1){
                    left=Math.min(left,i);
                    right=Math.max(right,i);
                }
            }
        }

        int u=Integer.MAX_VALUE,d=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    u=Math.min(u,i);
                    d=Math.max(d,i);
                }
            }
        }
        
        return (right-left+1)*(d-u+1);
    }
}