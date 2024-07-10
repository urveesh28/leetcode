class Solution {
    public int minOperations(String[] logs) {
        int steps=0;
        for(String str : logs){
            if(str.equals("./")){
                continue;
            }

            if(steps>0 && str.equals("../")){
                steps--;
            }

            if(!str.equals("../") && !str.equals("./")){
                steps++;
            }
        }

        if(steps<=0)return 0;
        return steps;
    }
}