//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    
    //using dfs
    /*private static void dfs(char[][] grid,int i,int j,boolean[][] visit){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || visit[i][j]==true || 
        grid[i][j]=='0'){
            return;
        }
        
        visit[i][j]=true;
        
        dfs(grid,i-1,j-1,visit);
        dfs(grid,i-1,j,visit);
        dfs(grid,i-1,j+1,visit);
        dfs(grid,i,j+1,visit);
        dfs(grid,i+1,j+1,visit);
        dfs(grid,i+1,j,visit);
        dfs(grid,i+1,j-1,visit);
        dfs(grid,i,j-1,visit);
        
        
    }*/
    
    
    //using bfs
    private static void bfs(char[][] grid,int i,int j,boolean[][] visited){
        visited[i][j]=true;
        
        int[] a=new int[2];
        a[0]=i;a[1]=j;
        
        Queue<int[]> q=new LinkedList<>();
        q.offer(a);
        
        while(!q.isEmpty()){
            int[] b=q.poll();
            
            //adjacency
            for(int delrow=-1;delrow<=1;delrow++){
                for(int delcol=-1;delcol<=1;delcol++){
                    int row=b[0]+delrow;
                    int col=b[1]+delcol;
                    
                    if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && 
                    visited[row][col]==false && grid[row][col]=='1'){
                        visited[row][col]=true;
                        q.offer(new int[]{row,col});
                    }
                }
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        // Code here
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visit=new boolean[m][n];
        
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visit[i][j]==false && grid[i][j]=='1'){
                    bfs(grid,i,j,visit);
                    count++;
                }
            }
        }
        
        return count;
    }
}