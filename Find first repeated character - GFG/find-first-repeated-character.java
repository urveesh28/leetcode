//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        int mindiff=Integer.MAX_VALUE;
        boolean flag=false;
        String minele="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int diff=i-map.get(s.charAt(i));
                if(diff<mindiff){
                    mindiff=diff;
                    minele+=s.charAt(i);
                    return minele;
                }
            }
            else{
                map.put(s.charAt(i),i);
            }
        }
        //if(flag)return minele;
        
        /*String str="";
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))>=2){
                str+=s.charAt(i);
                return str;
            }
        }*/
        return "-1";
    }
} 