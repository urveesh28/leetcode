//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int rowstart=0;
        int colstart=0;
        int rowend=r-1;
        int colend=c-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(rowstart<=rowend && colstart<=colend){
            for(int i=colstart;i<=colend;i++){
                list.add(matrix[rowstart][i]);
            }
            rowstart++;
            if(rowstart>rowend || colstart>colend){
                break;
            }
            for(int i=rowstart;i<=rowend;i++){
                list.add(matrix[i][colend]);
            }
            colend--;
            if(rowstart>rowend || colstart>colend){
                break;
            }
            
            for(int i=colend;i>=colstart;i--){
                list.add(matrix[rowend][i]);
            }
            rowend--;
            if(rowstart>rowend || colstart>colend){
                break;
            }
            
            for(int i=rowend;i>=rowstart;i--){
                list.add(matrix[i][colstart]);
            }
            colstart++;
            if(rowstart>rowend || colstart>colend){
                break;
            }
        }
        return list;
    }
}
