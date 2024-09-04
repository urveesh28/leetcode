class Solution {
    public int candy(int[] ratings) {
        int[] left=new int[ratings.length];
        int[] right=new int[ratings.length];
        int sum=0;
        left[0]=1;
        right[ratings.length-1]=1;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i-1]<ratings[i]){
                left[i]=left[i-1]+1;
            }
            else{
                left[i]=1;
            }
        }

        for(int i=ratings.length-2;i>=0;i--){
            if((ratings[i]>ratings[i+1]) && (left[i]<=left[i+1])){
                left[i]=left[i+1]+1;
            }
        }

        //System.out.println(Arrays.toString(left));
        for(int i=0;i<ratings.length;i++){
            sum=sum+left[i];
        }
        return sum;
    }
}