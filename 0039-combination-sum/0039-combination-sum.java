class Solution {

    /*private static void helper(int[] arr,List<List<Integer>> ans,List<Integer> l,int tar,int i,int total){
        if(total>tar || i>=arr.length)return;
        if(total==tar){
            if(!ans.contains(l)){
                ans.add(new ArrayList<>(l));
                return;
            }
        }

        l.add(arr[i]);
        helper(arr,ans,l,tar,i,total+arr[i]);
        l.remove(l.size()-1);
        helper(arr,ans,l,tar,i+1,total);
    }*/

    private static void helper(int[] arr,List<List<Integer>> ans,List<Integer> l,int tar,int start){
        if(tar<0)return;
        if(tar==0){
            ans.add(new ArrayList<>(l));
            return;
        }

        for(int j=start;j<arr.length;j++){
            l.add(arr[j]);
            helper(arr,ans,l,tar-arr[j],j);
            l.remove(l.size()-1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        //helper(candidates,ans,l,target,0,0);
        helper(candidates,ans,l,target,0);
        return ans;
    }
}