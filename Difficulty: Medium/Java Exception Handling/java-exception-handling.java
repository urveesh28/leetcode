// User function Template for Java

class Solution {
    public int findMin(int a, int b) {
        // Your code here
        int min=Integer.MAX_VALUE;
        int p=a+b;
        min=Math.min(min,p);
        int q=a-b;
        min=Math.min(min,q);
        int r=a*b;
        min=Math.min(min,r);
        
        try{
            int s=a/b;
            min=Math.min(min,s);
        }
        catch(ArithmeticException e){
            
        }
        return min;
    }
}