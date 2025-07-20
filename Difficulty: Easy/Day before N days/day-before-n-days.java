class Solution {
    public int dayBefore(int d, int n) {
        // code here
        if(d>=n){
            return d-n;
        }
        else{
            return (n-d)%7 +1;
        }
    }
}