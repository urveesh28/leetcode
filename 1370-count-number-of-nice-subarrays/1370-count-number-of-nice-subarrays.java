class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        //will store the occurences

        int curr=0;
        int res=0;
        
        //for prefix sum
        map.put(0,1);
        for(int i : nums){
            curr+=i%2;
            //prefix array
            res+=map.getOrDefault(curr-k,0);
            map.put(curr,map.getOrDefault(curr,0)+1);

        }

        //original 1,1,2,1,1
        //prefix   1,2,2,3,4

        
        return res;
    }
}