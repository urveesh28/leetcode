class Solution {
    private static boolean dfs(int[][] grid1,int[][] grid2,int i,int j,boolean[][] visited){
        if(i<0 || j<0 || i==grid1.length || j==grid1[0].length || visited[i][j] || grid2[i][j]==0){
            return true;
        }
        
        if(grid1[i][j]==0){
            return false;
        }

        visited[i][j]=true;
        
        boolean a=dfs(grid1,grid2,i-1,j,visited);
        boolean b=dfs(grid1,grid2,i+1,j,visited);
        boolean c=dfs(grid1,grid2,i,j+1,visited);
        boolean d=dfs(grid1,grid2,i,j-1,visited);
        
        return a && b && c && d;
    }
    
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count=0;
        int n=grid2.length;
        int m=grid2[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid2[i][j]==1 && visited[i][j]==false && dfs(grid1,grid2,i,j,visited)){
                    count++;
                }
            }
        }
        return count;
    }
}