class Solution {
    public int firstMissingPositive(int[] nums) {
       
        //this is giving TLE
        /*int missing=1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        while(true){
            if(list.contains(missing)){
                missing++;
            }
            if(!list.contains(missing)){
                break;
            }
        }
        return missing;*/

        int[] a=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val>0 && val<=nums.length){
                a[val]=1;
            }
        }

        //checking for zero the first zero's position will be the missing no.
        for(int i=1;i<a.length;i++){
            if(a[i]==0){
                return i;
            }
        }
        return a.length;

    }
}