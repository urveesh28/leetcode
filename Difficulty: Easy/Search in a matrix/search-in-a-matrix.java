//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int mat[][] = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                  mat[i][j] = sc.nextInt();
            }
            
            int x = sc.nextInt();
            
            System.out.println (new Sol().matSearch(mat, n, m, x));
        }
        
    }
}
// } Driver Code Ends


class Sol
{
    
    private static int binSearch(int[] mat,int X,int N){
        int low=0;
        int high=N-1;
        
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(mat[mid]==X)return 1;
            else if(mat[mid]>X){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        return 0;
    }
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        // your code here

        for(int i=0;i<N;i++){
            if(X>=mat[i][0] && X<=mat[i][M-1]){
                int index = binSearch(mat[i],X,M);
                if(index>0)return index;
            }
        }
        
        return 0;
    }
}