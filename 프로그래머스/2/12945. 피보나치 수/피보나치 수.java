class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] fibo = {1,0};
        for(int i = 2; i<= n; i++){
            int tmp = fibo[0];
            fibo[0] = (fibo[0] + fibo[1])%1234567;
            fibo[1] = tmp;
        }
        answer = fibo[0];
        return answer;
    }
}