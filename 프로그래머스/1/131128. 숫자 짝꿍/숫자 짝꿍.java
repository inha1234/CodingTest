class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder("");
        int[] tmpX = new int[10];
        int[] tmpY = new int[10];
        int cnt = 0;
        for(int i = 0; i<X.length(); i++){
            tmpX[X.charAt(i)-48]++;
        }
        for(int i = 0; i<Y.length(); i++){
            tmpY[Y.charAt(i)-48]++;
        }
        for(int i = 9; i>=0; i--){
            if(tmpX[i]>0&&tmpY[i]>0){
                int idx = (tmpX[i]>tmpY[i] ? tmpY[i] : tmpX[i]);
                for(int j = 0; j < idx; j++){
                    if(i==0){
                        if(cnt==9){
                            return "0";
                        }
                    }
                    answer.append(i);
                }
            } else{
                cnt++;
            }
        }
        if(cnt==10){
            return "-1";
        }
        return answer.toString();
    }
}