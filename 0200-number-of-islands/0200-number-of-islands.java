class Solution {
    /* using dfs
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
    */

    //using bfs
    
    //directions
    

    private static void bfs(char[][] grid,boolean[][] visited,int i,int j){
        //mark true
        visited[i][j]=true;
        int[] rdrs={-1,1,0,0};
        int[] cdrs={0,0,-1,1};

        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});

        while(!q.isEmpty()){
            int[] a=q.poll();
            int row=a[0];
            int col=a[1];
            
            //adjacency
            for(int k=0;k<4;k++){
                int nrow=row+rdrs[k];
                int ncol=col+cdrs[k];

                    //condition
                    if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length &&
                    !visited[nrow][ncol] && grid[nrow][ncol]=='1'){
                        visited[nrow][ncol]=true;
                        q.offer(new int[]{nrow,ncol});
                    }
                
            }
        }
    }

    public int numIslands(char[][] grid) {
        boolean[][] visit=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visit[i][j]==false && grid[i][j]=='1'){
                    bfs(grid,visit,i,j);
                    count++;
                }
            }
        }

        return count;
    }
}