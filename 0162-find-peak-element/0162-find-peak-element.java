class Solution {
    public int findPeakElement(int[] arr) {
        int low=0,end=arr.length-1,mid=0;
        if(arr.length==1)return 0;
        while(low<end){
            mid=low+(end-low)/2;
            
            
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }

            else{
                end=mid;
            }

            
        }
        return low;
    }
}