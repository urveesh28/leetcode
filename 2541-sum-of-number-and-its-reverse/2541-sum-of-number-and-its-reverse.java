class Solution {
    
    private boolean helper(int n){
        for(int i=0;i<=n;i++){
            int a=i;
            StringBuilder sb=new StringBuilder(Integer.toString(a));
            sb.reverse();
            int c=Integer.parseInt(sb.toString());
            if(a+c==n)return true;
        }
        return false;
    }
    
    public boolean sumOfNumberAndReverse(int num) {
        return helper(num);
    }
}