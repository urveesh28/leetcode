class Solution {
    public String getEncryptedString(String s, int k) {
        String ans="";
        for(int i=0;i<s.length();i++){
            ans+=s.charAt((i+k)%s.length());
        }
        return ans;
    }
}