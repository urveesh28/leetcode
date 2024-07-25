class Solution {
    
    private static void merge(int[] a,int l,int m,int h){
        int n1=m-l+1;
        int n2=h-m;
        
        int[] L=new int[n1];
        int[] R=new int[n2];

        //copy
        for(int i=0;i<n1;i++){
            L[i]=a[l+i];
        }

        for(int i=0;i<n2;i++){
            R[i]=a[m+i+1];
        }

        //now
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                a[k]=L[i];
                i++;
            }

            else{
                a[k]=R[j];
                j++;
            }
            k++;
        }

        //for remaining elements from L array
        while(i<n1){
            a[k]=L[i];
            i++;
            k++;
        }

        //for remaining elements from R array
        while(j<n2){
            a[k]=R[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(int[] a,int l,int h){
        
        //condition
        if(l<h){
        int m=l+(h-l)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,h);
        merge(a,l,m,h);
    }
    }
    
    public int[] sortArray(int[] nums) {
        //Arrays.sort(nums);
        //return nums;

        //merge sort
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}