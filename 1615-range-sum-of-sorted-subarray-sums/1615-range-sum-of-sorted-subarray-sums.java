class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        
        //brute force as contraints are small
        long csum=0;
        long mod=1000000007;
        int[] ans=new int[n*(n+1)/2];
        int k=0;

        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                ans[k++]=(int)sum;
            }
        }

        Arrays.sort(ans);
        
        for(int i=left-1;i<right;i++){
            csum=(csum+ans[i])%mod;
        }

        return (int)(csum%mod);
    }
}