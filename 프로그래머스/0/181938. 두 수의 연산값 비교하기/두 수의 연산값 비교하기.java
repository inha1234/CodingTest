class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String tmp = Integer.toString(a) + Integer.toString(b);
        answer = a*b*2;
        if(Integer.parseInt(tmp)>=answer){
            return Integer.parseInt(tmp);
        }
        return answer;
    }
}