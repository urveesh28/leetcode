//{ Driver Code Starts
import java.util.*;
import java.util.stream.*; 
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here\
        if(a.length()!=b.length())return false;
        String c=a.toLowerCase();
        String d=b.toLowerCase();
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        
        for(int i=0;i<a.length();i++){
            map1.put(a.charAt(i),map1.getOrDefault(a.charAt(i),0)+1);
            map2.put(b.charAt(i),map2.getOrDefault(b.charAt(i),0)+1);
        }
        
        for(Map.Entry<Character,Integer> entry : map1.entrySet()){
            char k=entry.getKey();
            int v=entry.getValue();
            if(!map2.containsKey(k)){
                return false;
            }
            else{
                map2.put(k,map2.get(k)-v);
            }
        }
        
        for(char i : map2.keySet()){
            if(map2.get(i)>0)return false;
        }
        return  true;
        
    }
}