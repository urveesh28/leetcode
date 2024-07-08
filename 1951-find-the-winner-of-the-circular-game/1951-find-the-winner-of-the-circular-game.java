class Solution {
    public int findTheWinner(int n, int k) {
        //simulation for n=6 and k=5
        //0,1,2,3,4,5
        //0,1,2,3,5
        //0,1,2,5
        //0,1,2
        //0,2
        //0

        //last return val[0]+1
        
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(i);
        }

        int i=0;
        int curr=0;
        while(ans.size()>1){
            i=(k-1+curr)%ans.size();
            ans.remove(i);
            curr=i;
        }
        return ans.get(0)+1;
    }
}