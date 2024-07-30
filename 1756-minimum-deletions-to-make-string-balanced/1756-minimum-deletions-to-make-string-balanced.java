class Solution {
    public int minimumDeletions(String s) {
        int min=0;
        int acount=0;
        int bcount=0;
        for(char ch : s.toCharArray()){
            if(ch=='a'){
                min=Math.min(min+1,bcount);
            }
            else{
                bcount++;
            }
        }

        return min;
    }
}