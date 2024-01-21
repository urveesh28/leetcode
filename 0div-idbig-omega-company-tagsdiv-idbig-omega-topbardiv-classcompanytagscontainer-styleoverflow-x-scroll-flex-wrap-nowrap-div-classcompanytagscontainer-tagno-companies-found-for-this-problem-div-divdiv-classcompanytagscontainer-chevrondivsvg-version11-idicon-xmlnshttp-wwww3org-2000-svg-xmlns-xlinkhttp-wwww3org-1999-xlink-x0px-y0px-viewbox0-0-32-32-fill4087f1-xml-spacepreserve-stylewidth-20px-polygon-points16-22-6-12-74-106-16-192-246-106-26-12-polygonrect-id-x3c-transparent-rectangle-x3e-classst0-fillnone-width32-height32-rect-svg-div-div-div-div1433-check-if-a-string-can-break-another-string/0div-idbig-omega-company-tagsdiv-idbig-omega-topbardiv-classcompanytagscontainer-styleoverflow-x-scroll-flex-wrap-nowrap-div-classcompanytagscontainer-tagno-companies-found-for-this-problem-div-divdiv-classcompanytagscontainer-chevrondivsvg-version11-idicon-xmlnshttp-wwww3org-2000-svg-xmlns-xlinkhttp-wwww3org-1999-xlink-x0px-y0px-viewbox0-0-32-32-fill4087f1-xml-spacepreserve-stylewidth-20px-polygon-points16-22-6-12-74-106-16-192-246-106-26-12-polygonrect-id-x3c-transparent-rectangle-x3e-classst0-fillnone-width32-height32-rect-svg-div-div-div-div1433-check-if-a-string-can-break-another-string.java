class Solution {
    
    public static boolean breakString(char[] arr1,char[] arr2){
        boolean flag1=true;
        boolean flag2=true;
        for(int i=0;i<Math.min(arr1.length,arr2.length);i++){
            if(arr2[i]<arr1[i])flag1=false;
        }

        for(int i=0;i<Math.min(arr1.length,arr2.length);i++){
            if(arr1[i]<arr2[i])flag2=false;
        }

        return (flag1||flag2);
    }
    
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return breakString(arr1,arr2);
    }
}