//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
        // code here
        
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        int x=0,y=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if((entry.getKey()-'a'+1)%2!=0 && entry.getValue()%2!=0){
                y++;
            }
            if((entry.getKey()-'a'+1)%2==0 && entry.getValue()%2==0){
                x++;
            }
            
        }
        
        if((x+y)%2==0)return "EVEN";
        return "ODD";
    }
}
