class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < m*t; i++){
            str.append(Integer.toString(i, n));
        }
        for(int i = p-1; i < str.length(); i = i + m){
            answer += str.charAt(i);
            if(answer.length()==t){
                break;
            }
        }
        answer = answer.toUpperCase();
        return answer;
    }
}