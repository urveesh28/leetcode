//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	    int rowstart=0;
	    int rowend=n-1;
	    int colstart=0;
	    int colend=m-1;
	    k=k-1;
	    while(rowstart<=rowend && colstart<=colend){
	        for(int i=colstart;i<=colend;i++){
	            if(k==0)return A[rowstart][i];
	            --k;
	        }
	        
	        rowstart++;
            if(rowstart>rowend || colstart>colend){
                break;
            }
            
            for(int i=rowstart;i<=rowend;i++){
                if(k==0)return A[i][colend];
                --k;
            }
            
            colend--;
            if(rowstart>rowend || colstart>colend){
                break;
            }
            
            for(int i=colend;i>=colstart;i--){
                if(k==0)return A[rowend][i];
                --k;
            }
            
            rowend--;
            if(rowstart>rowend || colstart>colend){
                break;
            }
            
            for(int i=rowend;i>=rowstart;i--){
                if(k==0)return A[i][colstart];
                --k;
            }
            colstart++;
            if(rowstart>rowend || colstart>colend){
                break;
            }
            
	        
	    }
	    return 0;
    }
}