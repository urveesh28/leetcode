class Solution {
    public String addStrings(String num1, String num2) {
        
        
        java.math.BigInteger big1=new java.math.BigInteger(num1);
        java.math.BigInteger big2=new java.math.BigInteger(num2);
        big1=big1.add(big2);
        //String res=
        return(big1.toString());
    }
}