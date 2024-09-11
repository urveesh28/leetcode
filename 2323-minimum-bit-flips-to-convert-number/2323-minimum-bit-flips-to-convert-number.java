class Solution {
    public int minBitFlips(int start, int goal) {
        int min=0;
        int i=0;
        while(i<32){
            int bit1=(start & (1<<i));
            int bit2=(goal & (1<<i));
            if(bit1!=bit2){
                min++;
            }
            i++;
        }
        return min;
    }
}