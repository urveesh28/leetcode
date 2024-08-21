class Solution {
    
    public int orangesRotting(int[][] grid) {
        //my solution
        //using bfs

        //array stores - i,j,time
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j,0});
                    visited[i][j]=true;
                }
            }
        }

        int maxTime=0;
        int[] dir={-1,0,1,0,-1};

        while(!q.isEmpty()){
            int[] a=q.poll();
            int r=a[0];
            int c=a[1];
            int t=a[2];
            maxTime=Math.max(maxTime,t);
            for(int k=0;k<4;k++){   
                int nrow=r+dir[k];
                int ncol=c+dir[k+1];

                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length 
                && visited[nrow][ncol]==false && grid[nrow][ncol]==1){
                    visited[nrow][ncol]=true;
                    grid[nrow][ncol]=2;
                    
                    q.offer(new int[]{nrow,ncol,t+1});
                }
            }
            
            
            
        }

        
        for(int[] i : grid){
            for(int j=0;j<i.length;j++){
                if(i[j]==1){
                    return -1;
                }
            }
        }

        
        return maxTime;


        
    }
}