class Solution {
    public String solution(int[] food) {
        String answer = "";
        int tmp = 0;
        for(int i = 1; i<food.length; i++){
            tmp = food[i]/2;
            for(int j = 0; j<tmp; j++){
                answer += "" + i;
            }
        }
        tmp = answer.length();
        answer += "" + 0;
        for(int i = tmp-1; i>=0; i--){
            answer += "" + answer.charAt(i);
        }
        return answer;
    }
}