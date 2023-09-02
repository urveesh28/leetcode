class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //using simple linear search
        int maxindex=-1;
        int maxval=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                maxval=Math.max(arr[i],maxval);
                maxindex=i;
                break;
            }
        }
        return maxindex;
    }
}