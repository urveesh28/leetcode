class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        
        //brute force as contraints are small
        long csum=0;
        long mod=1000000007;
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                sum=sum%mod;
                ans.add((int)sum);
            }
        }

        ans.sort((a,b)->(a-b));
        
        for(int i=left-1;i<right;i++){
            csum+=ans.get(i);
        }

        return (int)(csum%mod);
    }
}