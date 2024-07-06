class Solution {
    public int passThePillow(int n, int time) {
        int t=(n-1)*2;
        
        if(time%t<n){
            return time%t+1;
        }
        return 2*n-time%t-1;
    }
}