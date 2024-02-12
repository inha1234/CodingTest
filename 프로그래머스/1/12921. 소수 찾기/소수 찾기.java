class Solution {
    public int solution(int n) {
        int answer = 2;
        if(n==2){
            return 1;
        } else if(n==3){
            return 2;
        }
        iFor:
        for(int i = 4; i <= n; i++){
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i%j==0){
                    continue iFor;
                }
            }
            answer++;
        }
        return answer;
    }
}