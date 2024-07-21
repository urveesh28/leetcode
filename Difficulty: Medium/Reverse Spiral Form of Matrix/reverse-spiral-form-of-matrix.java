//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        int[] ans=new int[R*C];
        int top=0;
        int bottom=R-1;
        int left=0;
        int right=C-1;
        
        //spiral matrix logic
        int k=0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans[k++]=a[top][i];
            }
            
            top++;
            
            for(int i=top;i<=bottom;i++){
                ans[k++]=a[i][right];
            }
            
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans[k++]=a[bottom][i];
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans[k++]=a[i][left];
                }
                left++;
            }
        }
        
        //last reverse the array
        for(int i=0;i<ans.length/2;i++){
            int t=ans[i];
            ans[i]=ans[ans.length-i-1];
            ans[ans.length-i-1]=t;
        }
        return ans;
    }
}