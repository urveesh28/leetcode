class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0,j=0;i<nums1.length && j<nums2.length;){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }

            else if(nums1[i]>nums2[j])j++;
            else i++;
        }
        int[] a=new int[list.size()];
        int i=0;
        for(int k : list){
            a[i++]=k;
        }

        return a;
    }
}