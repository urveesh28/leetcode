//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public int sumOfMiddleElements(int[] arr1,int[] arr2) {
        // code here
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            ans.add(arr1[i]);
            ans.add(arr2[i]);
        }
        
        Collections.sort(ans);
        
        if(ans.size()%2==0){
            return  ans.get(ans.size()/2-1) + ans.get(ans.size()/2) ;
        }
        
        return ans.get(ans.size()/2);
        
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.sumOfMiddleElements(arr, brr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends