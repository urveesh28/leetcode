class Solution {
    
    private static boolean prime(int num){
        //seive of eratosthenes
        if(num<2)return false;
        int c=0;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public int nonSpecialCount(int l, int r) {
        int total=r-l+1;
        //using seive of eratosthenes logic

        int c=0;
        for(int i=2;i*i<=r;i++){
            if(prime(i) && (i*i<=r && i*i>=l)){
                c++;
            }
        }

        return total-c;
    }
}