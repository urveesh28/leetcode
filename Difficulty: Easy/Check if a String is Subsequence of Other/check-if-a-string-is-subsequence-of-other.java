class Solution {
    
    private static boolean helper(String s1,String s2){
        boolean flag=false;
        int i=0,j=0;
        
        while(i<s1.length() && j<s2.length()){
            
            while(i<s1.length() && j<s2.length() && s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            
            j++;
            
            
        }
        
        return i==s1.length();
        
        
    }
    
    public boolean isSubSeq(String s1, String s2) {
        // code here
        //two pointer approach
        return helper(s1,s2);
    }
};