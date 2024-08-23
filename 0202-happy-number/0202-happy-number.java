class Solution {
    public static int chkfor(int no){
        int sum=0;
        while(no>0){
            sum=sum+(no%10)*(no%10);
            no/=10;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(true){
             n=chkfor(n);
            if(n==1)return true;
            int size=set.size();
            set.add(n);
            if(set.size()==size)return false;
        }
        //return false;
    }
}