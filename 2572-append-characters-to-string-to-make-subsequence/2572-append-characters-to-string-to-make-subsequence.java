class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        while(j<t.length() && i<s.length()){
            if(t.charAt(j)==s.charAt(i)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return t.length()-j;
    }
}