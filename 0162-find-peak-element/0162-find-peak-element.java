class Solution {
    public int findPeakElement(int[] arr) {
        //using linear search
        if(arr.length==1)return 0;
        int maxval=Integer.MIN_VALUE;
        int maxindex=-1;
        for(int i=0;i<arr.length;i++){
            if(maxval<arr[i]){
                maxval=arr[i];
                maxindex=i;
            }
        }
        return maxindex;
    }
}