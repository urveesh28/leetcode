public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int[] arr=new int[32];
        long ans=0;
        for(int i=0;i<32;i++){
            arr[i]=(n & 1);
            n=n>>1;
        }

        //converting to number
        for(int i=31;i>=0;i--){
            ans=ans+(long)(arr[i]*Math.pow(2,31-i));
        }
        return (int)(ans);
    }
}