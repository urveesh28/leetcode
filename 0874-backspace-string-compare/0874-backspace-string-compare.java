class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch!='#'){
                sb1.append(ch);
            }
            else{
                if(sb1.length()!=0){
                    sb1.delete(sb1.length()-1,sb1.length());
                }
            }
        }

        for(char ch : t.toCharArray()){
            if(ch!='#'){
                sb2.append(ch);
            }
            else{
                if(sb2.length()!=0){
                    sb2.delete(sb2.length()-1,sb2.length());
                }
            }
        }

        return sb1.toString().equals(sb2.toString());
    }
}