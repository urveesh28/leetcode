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

            int key = Integer.parseInt(in.readLine().trim());

            out.println(new Solution().threeSumClosest(arr, key));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int threeSumClosest(int[] array, int target) {
        // code here
        Arrays.sort(array);
        int i=0;
        int psum=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int fsum=0;
        while(i<array.length-2){
            int j=i+1;
            int k=array.length-1;
            
            while(j<k){
                int currsum=array[i]+array[j]+array[k];
                int diff=Math.abs(currsum-target);
                
                if(currsum==target){
                    return currsum;
                }
                
                if(currsum>target){
                    k--;
                }
                
                if(currsum<target){
                    j++;
                }
                
                if(diff==min){
                    if(currsum>psum){
                        fsum=currsum;
                        psum=currsum;
                    }
                }
                
                if(diff<min){
                    fsum=currsum;
                    min=diff;
                    psum=currsum;
                }
                
                
            }
            i++;
        }
        
        return fsum;
    }
}
