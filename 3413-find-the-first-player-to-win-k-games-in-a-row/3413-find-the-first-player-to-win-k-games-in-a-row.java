class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        if(k>=skills.length){
            //find max ans its index
            int max=-1,index=0;
            for(int i=0;i<skills.length;i++){
                if(max<skills[i]){
                    max=skills[i];
                    index=i;
                }
            }

            return index;
        }
        
        int c=0;
        int i=0;
        int j=1;
        while(j<skills.length){
            if(skills[i]>skills[j]){
                c++;
            }
            else{
                c=1;
                i=j;
            }
            j++;
            if(c==k)return i;
        }
        return i;
    }
}