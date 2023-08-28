class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[n*2];
        int k=1 , l=0 , j=0;
        for(int i=0;i<n;i++){
            arr[j]=nums[i];
            j+=2;
            arr[k]=nums[n+i];
            k+=2;
        }
        return arr;
    }
}