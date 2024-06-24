class Solution {
    public boolean checkRecord(String s) {
        if(s.contains("LLL")){
            return false;
        }

        int a=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                a++;
            }

            if (a>=2){
                return false;
            }
        }

        return true;
    }
}