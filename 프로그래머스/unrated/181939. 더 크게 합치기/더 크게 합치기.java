class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int tmp = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int tmp2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        answer = Math.max(tmp, tmp2);
        return answer;
    }
}