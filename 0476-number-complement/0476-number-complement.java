class Solution {
    public int findComplement(int num) {
        String ans="";
        while(num>0){
            if(num%2==1){
                ans='0'+ans;
            }
            else{
                ans='1'+ans;
            }
            num/=2;
        }
        
        return Integer.parseInt(ans,2);
    }
}