class Solution {
    public int solution(String number) {
        int answer = 0;
        String tmp = number;
        for(int i = 0; i < tmp.length(); i++){
            answer += tmp.charAt(i)-'0';
        }
        answer %= 9;
        return answer;
    }
}