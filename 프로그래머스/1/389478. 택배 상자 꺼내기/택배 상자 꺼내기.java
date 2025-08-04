class Solution {
    public int solution(int n, int w, int num) {
        int size = n%w!=0 ? n/w+1 : n/w;
        int[][] boxs = new int[size][w];
        int idx = 0;
        int box = 1;
        f1:
        for(int i = 0; i < size; i++){
            if(i%2==1){
                for(int j = w-1; j >= 0; j--){
                    if(box==num){
                        idx = j;
                    }
                    boxs[i][j] = box++;
                    if(box>n){
                        break f1;
                    }
                }
            } else{
                for(int j = 0; j < w; j++){
                    if(box==num){
                        idx = j;
                    }
                    boxs[i][j] = box++;
                    if(box>n){
                        break f1;
                    }
                }
            }
        }
        int answer = 0;
        for(int i = size-1; i >= 0; i--){
            if(boxs[i][idx]==0){
                continue;
            }
            answer++;
            if(boxs[i][idx]==num){
                break;
            }
        }
        return answer;
    }
}