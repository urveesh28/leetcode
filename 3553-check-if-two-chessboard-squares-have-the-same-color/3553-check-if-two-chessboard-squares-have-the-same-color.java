class Solution {
    private static char helper(String str){
        char ch1=str.charAt(0);
        char ch2=str.charAt(1);
        char color='b';
        if(ch1=='a' || ch1=='c' || ch1=='e' || ch1=='g'){
            if((ch2-'0')%2==0){
                color='w';
            }
            else{
                color='b';
            }
        }
        else{
            if((ch2-'0')%2==0){
                color='b';
            }
            else{
                color='w';
            }
        }

        return color;
    }
    
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return helper(coordinate1)==helper(coordinate2);
    }
}