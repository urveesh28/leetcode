/*class Solution {

    private static int helper(int num,int[] dp){
        if(dp[num]!=-1)return dp[num];
        int count=0;
        int d=num;
        while(num!=1){
            if(dp[num]!=-1)return dp[num]+count;
            if(num%2==0){
                num/=2;
            }
            else{
                num=num*3+1;
            }
            count++;
        }
        return dp[d]=count;
    }

    public int getKth(int lo, int hi, int k) {
        int[] dp=new int[1000000];
        Queue<int[]> q=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0])return a[0]-b[0];
            else{
                return a[1]-b[1];
            }
        });

        Arrays.fill(dp,-1);
        dp[1]=0;
        dp[2]=1;
        
        
        for(int i=lo;i<=hi;i++){
           dp[i]=helper(i,dp);
           q.offer(new int[]{dp[i],i});
        }

        int ans=0;
        while(k-->0){
            ans=q.poll()[1];
        }

        return ans;

    }
}*/


class Solution {
    private static int helper(int n){
        int c=0;
        while(n!=1){
            if((n & 1)==0){
                n=n>>1;
            }
            else{
                n=n*3+1;
            }
            c++;
        }

        return c;
    }
    
    public int getKth(int lo, int hi, int k) {
        Queue<int[]> q=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0])return a[0]-b[0];
            else{
                return a[1]-b[1];
            }
        });

        for(int i=lo;i<=hi;i++){
            q.offer(new int[]{helper(i),i});
        }

        int ans=1;
        while(k-->0){
            ans=q.poll()[1];
        }

        return ans;


    }
}