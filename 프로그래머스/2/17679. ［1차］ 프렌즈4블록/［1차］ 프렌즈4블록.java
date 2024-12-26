class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] tmp = new char[m][n];
        for(int i = 0; i < m; i++){
            tmp[i] = board[i].toCharArray();
        }
        boolean isCheck;
        do{
            isCheck = false;
            boolean[][] bool = new boolean[m][n];
            for(int i = 0; i < m-1; i++){
                for(int j = 0; j < n-1; j++){
                    if(tmp[i][j] != ' ' && tmp[i][j] == tmp[i][j+1] &&
                      tmp[i][j] == tmp[i+1][j] && tmp[i][j] == tmp[i+1][j+1]){
                        bool[i][j] = bool[i][j+1] = bool[i+1][j] = bool[i+1][j+1] = true;
                        isCheck = true;
                    }
                }
            }
            
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(bool[i][j]){
                        tmp[i][j] = ' ';
                        answer++;
                    }
                }
            }
            
            for(int j = 0; j < n; j++){
                char tmpChar = ' ';
                forI:
                for(int i = m-1; i >= 0; i--){
                    if(tmp[i][j] == ' '){
                        for(int l = i; l >= 0; l--){
                            if(tmp[l][j] != ' '){
                                tmpChar= tmp[l][j];
                                tmp[i][j] = tmpChar;
                                tmp[l][j] = ' ';
                                break;
                            } else if(l==0){
                                continue forI;
                            }
                        }
                    }
                }
            }
        }while(isCheck);
        return answer;
    }
}