class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int cur = numLog[0];
        for(int i = 1; i < numLog.length; i++){
            int tmp = (cur-numLog[i])*-1;
            if(tmp == 1){
                answer += "w";
            } else if(tmp == -1){
                answer += "s";
            } else if(tmp == 10){
                answer += "d";
            } else if(tmp == -10){
                answer += "a";
            }
            cur = numLog[i];
        }
        return answer;
    }
}