class Solution {
    
    /* using BFS
    private static void bfs(int[][] img,int i,int j,int newColor,int oldColor,boolean[][] visited){
        
        //for 4 directions
        int[] delrow={-1,0,0,1};
        int[] delcol={0,-1,1,0};

        visited[i][j]=true;
        //set color
        img[i][j]=newColor;

        //declare queue
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});


        while(!q.isEmpty()){
            int[] a=q.poll();
            int row=a[0];
            int col=a[1];

            //for adjacent cells
            for(int k=0;k<4;k++){
                int nrow=row+delrow[k];
                int ncol=col+delcol[k];

                //conditions
                if(nrow>=0 && nrow<img.length && ncol>=0 && ncol<img[0].length &&
                visited[nrow][ncol]==false && img[nrow][ncol]==oldColor){
                    visited[nrow][ncol]=true;
                    img[nrow][ncol]=newColor;
                    q.offer(new int[]{nrow,ncol});
                }
            }
        }

    }

    */

    //using DFS
    
    //4 directions
    public static int[] delrow={-1,0,0,1};
    public static int[] delcol={0,-1,1,0};

    private static void dfs(int[][] img,boolean[][] visited,int i,int j,int newColor,int oldColor){
        //conditions
        if(i<0 || i>=img.length || j<0 || j>=img[0].length || visited[i][j]==true
        || img[i][j]!=oldColor){
            return;
        }

        //mark cell visited
        visited[i][j]=true;
        
        //
        img[i][j]=newColor;

        //calls
        for(int k=0;k<4;k++){
            int nrow=i+delrow[k];
            int ncol=j+delcol[k];

            dfs(img,visited,nrow,ncol,newColor,oldColor);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        boolean[][] visited=new boolean[image.length][image[0].length];
        int oldColor=image[sr][sc];
        dfs(image,visited,sr,sc,color,oldColor);
        return image;
    }
}