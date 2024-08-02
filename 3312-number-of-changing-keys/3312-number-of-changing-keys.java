class Solution {
    public int countKeyChanges(String s) {
        int c=0;
        String str=s.toLowerCase();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                c++;
            }
        }
        return c;
    }
}