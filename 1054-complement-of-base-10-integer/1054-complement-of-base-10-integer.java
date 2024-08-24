class Solution {
    public int bitwiseComplement(int n) {
       int[] arr=new int[100000];
       int i=0,sum=0,j;
        if(n==0)
            return 1;
       else
       {    while(n!=0)
            {
                arr[i]=n%2;
                n=n/2;
                i++;
            }

            for(j=i-1;j>=0;j--)
            {
           
                if(arr[j]==1)
                {
                    continue;
                }
                else
                {
                    sum+=1*Math.pow(2,j);
                }
            }
       return sum; 
    }
}
}