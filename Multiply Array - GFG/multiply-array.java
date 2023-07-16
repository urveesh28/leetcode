//{ Driver Code Starts
import java.util.*;

class GFG {
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n+5];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            System.out.println(obj.product(arr, n));
        }
	}
}

// } Driver Code Ends



class Solution {

    public static int product(int arr[],int n)
    {
        int result=1;
        for(int i=0;i<n;i++){
            result=result*arr[i];
        }
        return result;
    }
}
