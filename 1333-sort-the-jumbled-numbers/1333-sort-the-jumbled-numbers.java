class Solution {

    public int[] sortJumbled(int[] mapping, int[] nums) {
        int j=0;

        //storing num,mapped-num,position

        List<int[]> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s=Integer.toString(nums[i]);
            StringBuilder sb=new StringBuilder();
            
            for(char ch : s.toCharArray()){
                sb.append(mapping[ch-'0']);
            }

            arr.add(new int[]{nums[i],Integer.parseInt(sb.toString()),i});
            j++;
        }

        arr.sort((a,b)->{
            if(a[1]!=b[1]){
                return Integer.compare(a[1],b[1]);
            }
            else{
                return Integer.compare(a[2],b[2]);
            }
        });

        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i)[0];
        }

        return nums;
    }
}