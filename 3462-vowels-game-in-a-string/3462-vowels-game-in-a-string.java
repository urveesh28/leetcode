class Solution {
    public boolean doesAliceWin(String s) {
        int ans=0;
        for(char ch : s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')ans++;
        }

        if(ans==0)return false;
        return true;
    }
}