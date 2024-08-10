class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int max=0;
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=n-i){
                max=Math.max(max,n-i);
            }
        }
        return max;
    }
}