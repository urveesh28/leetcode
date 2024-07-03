class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(char move : moves.toCharArray()){
            if(move=='L')x-=1;
            else if(move=='R')x+=1;
            else if(move=='U')y+=1;
            else y-=1;
        }
        if(x==0 && y==0)return true;
        return false;
    }
}