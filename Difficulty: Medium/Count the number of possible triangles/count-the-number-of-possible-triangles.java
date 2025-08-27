class Solution {
    public int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=0;
        for(int i=arr.length-1;i>=2;i--){
            int j=0;
            int k=i-1;
            
            while(j<k){
                
                long sum=arr[j]+arr[k];
                if(sum>arr[i]){
                    count+=(k-j);
                    k--;
                }
            
                else{
                    j++;
                }
            }
        }
        
        return count;
        
        
    }
}