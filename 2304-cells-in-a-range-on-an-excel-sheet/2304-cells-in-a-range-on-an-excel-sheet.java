class Solution {
    public List<String> cellsInRange(String s) {
        
        ArrayList<String> list = new ArrayList<>();
        for(char i=s.charAt(0);i<=s.charAt(3);i++){
            for(char j=s.charAt(1);j<=s.charAt(4);j++){
                String str1="";
                String str2="";
                str1+=i;
                str2+=j;
                list.add(str1+str2);
            }
        }
        return list;
    }
}