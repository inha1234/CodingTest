class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        for(int i = 0; i<keyinput.length; i++){
            if(keyinput[i].equals("up")){
                if(y+1<=board[1]/2){
                    y++;
                }
            }
            if(keyinput[i].equals("down")){
                if(y-1>=-board[1]/2){
                    y--;
                }
            }
            if(keyinput[i].equals("right")){
                if(x+1<=board[0]/2){
                    x++;
                }
            }
            if(keyinput[i].equals("left")){
                if(x-1>=-board[0]/2){
                    x--;
                }
            }
        }
        return new int[]{x,y};
    }
}