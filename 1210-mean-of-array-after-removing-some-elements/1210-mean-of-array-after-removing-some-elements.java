class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int id1=(int)(0.05*arr.length);
        int id2=arr.length-id1;
        double ans=0;
        for(int i=id1;i<id2;i++){
            ans+=arr[i];
        }

        return ans/(arr.length-id1*2);
    }
}