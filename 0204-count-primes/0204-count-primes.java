class Solution {
    
    //using SEIVE OF ERATOSTHENES
    
    /*public static boolean checkPrime(int number){
        boolean flag=true;
        if(number>=2){
            for(int i=2;i<number;i++){
                if(number%i==0){
                    flag=false;
                    break;
                }
            }
        }
        else return false;
        return flag;
    }*/
    
    public int countPrimes(int n) {
        boolean[] b=new boolean[n];
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(b[i]==false){
                for(int j=i*i;j<n;j+=i){
                    b[j]=true;
                }
            }
        }

        int count=0;
        for(int i=2;i<b.length;i++){
            if(!b[i])count++;
        }
        return count;
    }
}