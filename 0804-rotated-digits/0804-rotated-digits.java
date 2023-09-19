class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            int temp=i;
            int flag=0;
            while(temp!=0){
                int val=temp%10;
                if(val==2 || val==5 || val==6 || val==9)flag++;
                else if(val==3 || val==4 || val==7) break;
                temp=temp/10;
            }
            if(temp==0 && flag>0)count++;
        }
        return count;
    }
}