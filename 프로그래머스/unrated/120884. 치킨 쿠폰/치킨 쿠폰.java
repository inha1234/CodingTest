class Solution {
    public int solution(int chicken) {
        int temp = chicken;
        int answer = 0;
        while(temp>=10){
            temp= temp-9;
            answer++;
        }
        return answer;
    }
}