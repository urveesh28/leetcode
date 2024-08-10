class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        int max=0;
    
        for(int i=0;i<n;i++){
            if(citations[i]>=n-i){
                max=Math.max(max,n-i);
            }
        }
        return max;
    }
}