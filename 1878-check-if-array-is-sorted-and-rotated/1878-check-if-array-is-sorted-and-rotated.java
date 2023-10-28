class Solution {
    public static void rotate(int copy[]){
        int lastval=copy[copy.length-1];
        for(int i=copy.length-2;i>=0;i--){
            copy[i+1]=copy[i];
        }
        copy[0]=lastval;
    }
    
    public boolean check(int[] nums) {
        
        int[] copy=new int[nums.length];
        for(int i =0;i<copy.length;i++){
            copy[i]=nums[i];
        }   
        Arrays.sort(nums);
        if(Arrays.toString(nums).compareTo(Arrays.toString(copy))==0)return true;
        
        int x=0;
        while(x<nums.length){
            rotate(copy);
            if(Arrays.toString(nums).compareTo(Arrays.toString(copy))==0)return true;
            x++;
        }
        return false;
    }
}