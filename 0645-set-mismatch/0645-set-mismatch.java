class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        int j=1;
        HashSet<Integer> set =new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                arr[0]=i;
            }
            else set.add(i);
        }

        for(int i : set){
            if(set.contains(j)){
                j++;
            }
        }
        arr[1]=j;
        return arr;
    }
}