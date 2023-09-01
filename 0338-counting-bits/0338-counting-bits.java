class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int j=0;
        for(int i=0;i<=n;i++){
            int count=0;
            int val=i;
            while(val!=0){
                if((val & 1)==1)count++;
                val=val>>1;
            }
            arr[i]=count;
        }
        return arr;
    }
}