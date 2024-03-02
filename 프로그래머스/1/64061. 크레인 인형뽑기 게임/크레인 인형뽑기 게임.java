class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int idx = 0;
        int[] tmp = new int[moves.length];
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][moves[i]-1]==0){
                    continue;
                } else{    
                    if(idx>0 && tmp[idx-1]==board[j][moves[i]-1]){
                        answer += 2;
                        tmp[idx--] = 0;
                    } else{
                        tmp[idx++] = board[j][moves[i]-1];
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
                
            }
        }
        return answer;
    }
}