class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String current = board[h][w];
        if(w-1>=0){
            if(current.equals(board[h][w-1])){
                answer++;
            }
        }
        if(h-1>=0){
            if(current.equals(board[h-1][w])){
                answer++;
            }
        }
        if(h+1<board.length){
            if(current.equals(board[h+1][w])){
                answer++;
            }
        }
        if(w+1<board.length){
            if(current.equals(board[h][w+1])){
                answer++;
            }
        }
        return answer;
    }
}