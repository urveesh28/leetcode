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
    
    //directions
    //public static int[][] arr={{-1,-1},{0,-1},{1,-1},{1,0},{1,1},{0,1},{1,1},{-1,0}};
    
    private static void dfs(char[][] grid,int i,int j,boolean[][] visit){
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
                    dfs(grid,i,j,visit);
                    count++;
                }
            }
        }
        
        return count;
    }
}