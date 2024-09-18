class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder sb=new StringBuilder();
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Integer.toString(nums[i]);
        }

        Arrays.sort(arr,(a,b)->{
            return (b+a).compareTo(a+b);
        });

        if(arr[0].equals("0")){
            return "0";
        }

        for(String str : arr){
            sb.append(str);
        }

        return sb.toString();
    }
}