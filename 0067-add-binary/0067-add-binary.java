class Solution {
    
    public static char[] helper(char ch1,char ch2,char ch3){
        if(ch3=='0'){
            //no carry
            if(ch1=='0' && ch2=='0'){
            return new char[]{'0','0'};
        }
        else if((ch1=='0' && ch2=='1') || (ch1=='1' && ch2=='0')){
            return new char[]{'1','0'};
        }
        else{
            return new char[]{'0','1'};
        }
        }

        if(ch1=='0' && ch2=='0'){
            return new char[]{'1','0'};
        }
        else if((ch1=='0' && ch2=='1') || (ch1=='1' && ch2=='0')){
            return new char[]{'0','1'};
        }
        return new char[]{'1','1'};

    }
    
    public String addBinary(String a, String b) {
        // 1 + 1 = 10
        // 1 + 0 = 1
        int i=a.length()-1;
        int j=b.length()-1;
        char carry='0';
        String ans="";
        while(i>=0 || j>=0 || carry!='0'){
            char value1=(i>=0?a.charAt(i):'0');
            char value2=(j>=0?b.charAt(j):'0');
            char[] values=helper(value1,value2,carry);
            carry=values[1];
            ans=values[0]+ans;
            i--;
            j--;
        }
        return ans;
    }
}