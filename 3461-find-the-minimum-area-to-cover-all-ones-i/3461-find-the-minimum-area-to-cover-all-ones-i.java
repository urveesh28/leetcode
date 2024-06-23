class Solution {
    public int minimumArea(int[][] grid) {
        int left=Integer.MAX_VALUE;
        int right=0;

        int u=Integer.MAX_VALUE,d=0;

        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1){
                    left=Math.min(left,i);
                    right=Math.max(right,i);
                    u=Math.min(u,j);
                    d=Math.max(d,j);
                }
            }
        }

        return (right-left+1)*(d-u+1);
    }
}