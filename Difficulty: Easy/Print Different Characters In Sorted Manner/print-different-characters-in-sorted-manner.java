// User function Template for Java
class Solution {
    public static String Sorted_Characters(String s) {
        // Your code here
        int[] map=new int[26];
        for(char ch : s.toCharArray()){
            map[ch-'a']++;
        }
        
        String ans="";
        for(int i=0;i<26;i++){
            if(map[i]>0){
                ans+=(char)('a'+i);
            }
        }
        
        return ans;
    }
}
