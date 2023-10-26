class Solution {
    public boolean isPerfectSquare(int num) {
        double ans=Math.sqrt(num);
        if(Math.ceil(ans)==Math.floor(ans))return true;
        return false;
    }
}