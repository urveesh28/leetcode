class Solution {
    public int missingNumber(int[] arr) {
        // code here
        Set<Integer> set=new HashSet<>();
        for(int i : arr){
            if(i>0)set.add(i);
        }
        
        int ans=1;
        while(set.contains(ans)){
            ans++;
        }
        
        return ans;
    }
}
