class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split("\\s+");
        String newstring="";
        for(int i=0;i<arr.length;i++){
            //if(arr[0]==" "||arr[arr.length-1]==" ")continue;
            newstring=newstring+arr[arr.length-i-1].trim()+" ";
        }
        return newstring.trim();
    }
}