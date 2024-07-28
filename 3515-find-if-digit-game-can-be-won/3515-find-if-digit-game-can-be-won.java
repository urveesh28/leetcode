class Solution {
    public boolean canAliceWin(int[] nums) {
        int ssum=0;
        int dsum=0;
        for(int i : nums){
            if(i<10)ssum+=i;
            if(i>=10)dsum+=i;
        }

        if(ssum>dsum || dsum>ssum)return true;
        return false;
    }
}