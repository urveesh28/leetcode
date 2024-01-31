class Solution {
    
    public static int find(int ele,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(ele==arr[i]){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>ele)return arr[j];
                }
                return -1;
            }
        }
        return -1;
    }
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        /*
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums2.length;
        int m=nums1.length;

        for(int i=0;i<n;i++){
            map.put(nums2[i],i);
        }

        int[] ans=new int[m];
        Arrays.fill(ans,-1);

        int k=0;
        for(int i=0;i<m;i++){
            int num=nums1[i];
            int j=map.getOrDefault(num,-1);
            if(j<0 || j>=n)k++;
            else{
                int max=nums2[j];
                System.out.println(max);
                for(int l=j+1;l<n;l++){
                   if(max<nums2[l]){
                       max=nums2[l];break;
                   }
                }

                if(max==nums2[j])ans[k++]=-1;
                else ans[k++]=max;
            }
        }
        return ans;
        
        */
        
        //2nd approach
        for(int i=0;i<nums1.length;i++){
            nums1[i]=find(nums1[i],nums2);
        }
        return nums1;
        
    }

        
}
    
