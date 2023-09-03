class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //using simple linear search
       /* int maxindex=-1;
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                
                maxindex=i;
                break;
            }
        }
        return maxindex;*/

        //using binary search
        int low=0,end=arr.length-1,mid=0;
        while(low<=end){
            mid=low+(end-low)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            
            if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]){
                low=mid;
            }

            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
                end=mid;
            }
        }
        return mid;

    }
}