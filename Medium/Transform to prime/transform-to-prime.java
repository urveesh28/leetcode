//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }
            Solution ob = new Solution();
            int ans=ob.minNumber(a,n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public static boolean chkPrime(long n){
        long val=(long)Math.sqrt(n);
        for(long i=2;i<=val;i++){
            if(n%i==0)return false;
        }
        return true;
    } 
    

    public int minNumber(int arr[], int N)
    {
        long sum=0,j=0;
        for(long i : arr)sum+=i;
        //System.out.println(sum);
        if(!chkPrime(sum)){
            while(!chkPrime(sum++))j++;
            return (int)j;
        }
        
        return 0;
    }
}
