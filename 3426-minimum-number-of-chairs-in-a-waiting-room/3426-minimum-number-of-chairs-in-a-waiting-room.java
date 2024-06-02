class Solution {
    public int minimumChairs(String s) {
        int c=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E')c++;
            else c--;
            ans=Math.max(ans,c);
        }

        return ans;

    }
}