class Solution {
    public long minimumSteps(String s) {
        long ans1=0,ans2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')ans1++;
            else ans2+=ans1;
        }
        return ans2;
    }
}