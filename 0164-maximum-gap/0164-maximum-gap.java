class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)
        return 0;
int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
for(int i:nums)
{
    min=Math.min(min,i);
max=Math.max(max,i);
}
   if((max-min)==0) return 0;
       int bucketsize=(int)Math.ceil((double)(max-min)/(nums.length-1));//d1
int[] maxbucket=new int[nums.length];       
int[] minbucket=new int[nums.length];
Arrays.fill(maxbucket,Integer.MIN_VALUE);
Arrays.fill(minbucket,Integer.MAX_VALUE);
for(int i=0;i<nums.length;i++)
{
    int index=(int)Math.ceil ((double)(nums[i]-min)/bucketsize);//d2
    minbucket[index]=Math.min(minbucket[index],nums[i]);
    maxbucket[index]=Math.max(maxbucket[index],nums[i]);
}
int pre=maxbucket[0];
int mg=bucketsize;
for(int i=1;i<nums.length;i++)
{
    if(minbucket[i]==Integer.MAX_VALUE) continue;
    mg=Math.max(mg,minbucket[i]-pre);
    pre=maxbucket[i];
}
return mg;
    }
}