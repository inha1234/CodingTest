class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n*(n+1))/2];
        int[][] tmp = new int[n][n];
        int num = 1;
        int row = 0;
        int col = 0;
        int direction = 0;
        while(num<=(n*(n+1))/2){
            tmp[row][col] = num++;
            
            if(direction==0){
                if(row + 1 < n && tmp[row+1][col]==0){
                    row++;
                } else{
                    direction++;
                    col++;
                }
            } else if(direction==1){
                if(col + 1 < n && tmp[row][col+1]==0){
                    col++;
                } else{
                    direction++;
                    row--;
                    col--;
                }
            } else if(direction==2){
                if(row-1 >=0 && col-1 >= 0 && tmp[row-1][col-1]==0){
                    col--;
                    row--;
                } else{
                    direction = 0;
                    row++;
                }
            }
        }
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                answer[idx++] = tmp[i][j];
            }
        }
        return answer;
    }
}