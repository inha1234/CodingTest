class Solution {
    public int solution(int n) {
        int cnt = 0;
        int answer = 0;
        while(cnt!=n){
            answer++;
            while(answer%3==0 || String.valueOf(answer).contains("3")){
                answer++;
            }
            cnt++;
        }
        return answer;
    }
}