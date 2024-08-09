//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            // int key = Integer.parseInt(in.readLine().trim());

            out.println(new Solution().Maximize(arr));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {


    private static void mergeSort(int[] arr,int l,int h){
        if(l>=h)return;
        int m=l+(h-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,h);
        merge(arr,l,m,h);
    }
    
    private static void merge(int[] arr,int l,int m,int h){
        int n1=m-l+1;
        int n2=h-m;
        
        int[] left=new int[n1];
        int[] right=new int[n2];
        
        //copy the elemens
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        
        for(int i=0;i<n2;i++){
            right[i]=arr[m+i+1];
        }
        
        int i=0;
        int j=0;
        int k=l;
        
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        
        //for remaining elements
        while(i<n1){
            arr[k++]=left[i++];
        }
        
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    int Maximize(int arr[]) {
        // Complete the function
        //sort using merge sort
        mergeSort(arr,0,arr.length-1);
        long sum=0;
        long mod=1000000007;
        for(int i=0;i<arr.length;i++){
            sum=(sum+(long)arr[i]*i)%mod;
        }
        
        return (int)sum;
    }
}
