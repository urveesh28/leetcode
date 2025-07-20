// User function Template for Java

class Solution {
    public static String TieBreak(String arr[]) {
        // Your code here
        //using tree map
        TreeMap<String,Integer> map=new TreeMap<>();
        for(String str : arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        
        String ans="";
        int max=Integer.MIN_VALUE;
        for(String str : map.keySet()){
            if(max<map.get(str)){
                ans=str;
                max=map.get(str);
            }
        }
        
        return ans;
    }
}

