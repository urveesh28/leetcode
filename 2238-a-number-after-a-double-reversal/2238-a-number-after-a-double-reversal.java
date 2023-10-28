class Solution {
    
    public static int reverse(int num,int ans){
        if(num==0)return ans;
        ans=ans*10+num%10;
        return reverse(num/10,ans);
    }

    public boolean isSameAfterReversals(int num) {
        int rev1=reverse(num,0);
        int rev2=reverse(rev1,0);
        if(rev2==num)return true;
        return false;    
    }
}