class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[] dx = {-1, 1, 0, 0, 1, -1, 1, -1};
        int[] dy = {0, 0, -1, 1, 1, -1, -1, 1};
        for(int i = 0; i<n; i++){
            forJ:
            for(int j = 0; j<n; j++){
                if(board[i][j]==1){
                    continue;
                }
                for(int k =0; k<8; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    
                    if(nx>=0 && ny<n && ny>=0 && nx<n){
                        if(board[nx][ny]==1){
                            continue forJ;
                        }
                    }
                }
                answer++;        
            }
        }
        return answer;
    }
}