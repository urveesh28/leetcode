//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        //first store all rotten oranges in queue with time=0;
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j,0});
                    visited[i][j]=true;
                }
            }
        }
        
        int[] dir={-1,0,1,0,-1};
        int maxTime=0;
        while(!q.isEmpty()){
            int[] a=q.poll();
            int r=a[0];
            int c=a[1];
            int t=a[2];
            maxTime=Math.max(maxTime,t);
            for(int i=0;i<4;i++){
                int nrow=r+dir[i];
                int ncol=c+dir[i+1];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !visited[nrow][ncol] &&
                grid[nrow][ncol]==1){
                    visited[nrow][ncol]=true;
                    grid[nrow][ncol]=2;
                    q.offer(new int[]{nrow,ncol,t+1});
                }
            }
        }
        
        for(int[] i : grid){
            for(int j=0;j<m;j++){
                if(i[j]==1)return -1;
            }
        }
        
        return maxTime;
    }
}