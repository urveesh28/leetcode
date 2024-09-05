class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] missing=new int[n];
        long sum=0;
        for(int i : rolls)sum+=i;
        long right=(n+rolls.length)*mean-sum;//21-12=9
        
        if(6*n < right || right<0 || right<n)return new int[]{};
        long q=right/n;
        long rem=right-q*n;
        //System.out.println("q = "+q+" rem = "+rem+" right = "+right);
        Arrays.fill(missing,(int)q);
        int i=0;
        while(rem>0){
            missing[i++]++;
            rem--;
        }

        return missing;
    }
}