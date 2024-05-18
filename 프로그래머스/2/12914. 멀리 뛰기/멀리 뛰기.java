class Solution {
    public long solution(int n) {
        if(n<3){
            return n;
        }
        long answer = 0;
        long[] dp = new long[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++){
            dp[i] = (dp[i-1] + dp[i-2])%1234567;
        }
        answer = dp[n-1];
        return answer;
    }
}