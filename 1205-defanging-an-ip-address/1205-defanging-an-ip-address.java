class Solution {
    //much better solution
        return address.replace(".", "[.]");
        
        /*String str="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                str+="[.]";
            }
            else{
                str+=address.charAt(i);
            }
        }
        //System.out.println(str);
        return str;*/
    }
}
