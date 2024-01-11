class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        if(n%3!=0)return new int[][]{};
        int[][] ans=new int[n/3][3];
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<n;i++){
            ans[j][i%3]=nums[i];
            if(i%3==2)j++;
        }

        for(int i=0;i<n/3;i++){
            if(Math.abs(ans[i][0]-ans[i][2])>k)return new int[][]{};
        }
        return ans;
    }
}