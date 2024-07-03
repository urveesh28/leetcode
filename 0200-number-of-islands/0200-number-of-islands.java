class Solution {
    
    private static void dfs(char[][] grid,int i,int j,boolean[][] visit){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0' || visit[i][j]==true){
            return;
        }

        visit[i][j]=true;

        //calls for 4 directions
        dfs(grid,i-1,j,visit);
        dfs(grid,i,j+1,visit);
        dfs(grid,i+1,j,visit);
        dfs(grid,i,j-1,visit);
    }

    public int numIslands(char[][] grid) {
        boolean[][] visit=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visit[i][j]==false && grid[i][j]=='1'){
                    dfs(grid,i,j,visit);
                    count++;
                }
            }
        }

        return count;
    }
}