class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos=0;
        int ans=0;
        for(int i=0;i<commands.size();i++){
            String cmd=commands.get(i);
            if(cmd.equals("RIGHT")){
                pos=pos+1;
            }

            else if(cmd.equals("LEFT")){
                pos=pos-1;
            }

            else if(cmd.equals("UP")){
                pos=pos-n;
            }

            else{
                pos=pos+n;
            }
        }
        return pos;
    }
}