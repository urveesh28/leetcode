class Solution {
    public String stringHash(String s, int k) {
        String res="";
        for(int i=0;i<s.length();i+=k){
            int sum=0;
            String subString=s.substring(i,i+k);
            for(int j=0;j<subString.length();j++){
                sum+=(subString.charAt(j)-'a');
            }
            sum=sum%26;
            res+=(char)(sum+97);
        }
        return res;
    }
}