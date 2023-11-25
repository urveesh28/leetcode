//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java





class  Solution
{
    void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        //brute force
        long ans1[]=new long[n/2];
        long ans2[]=new long[n/2];
        int i=n/2;
        while(i<n){
            ans1[i-n/2]=arr[i-n/2];
            ans2[i-n/2]=arr[i];
            i++;
        }
        
        i=0;
        int j=0,k=0;
        while(i<ans1.length && j<ans2.length){
            arr[k]=ans1[i];
            k++;i++;
            arr[k]=ans2[j];
            k++;j++;
        }
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int k =Integer.parseInt(q[1]);
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
             Solution ob = new  Solution();
            //ArrayList<Long> ans=
            ob.shuffleArray(a,n);
           // System.out.println(ob.shuffleArray(a,n));
            for (int i = 0; i < n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}


// } Driver Code Ends