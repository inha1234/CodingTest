class Solution {
    public int[] solution(int num, int total) {
        int cnt = num;
        int x = total/num;
        cnt--;
        int start = x- cnt/2;
        int[] answer = new int[num];
        for(int i = 0; i<num; i++){
            answer[i] = start++;
        }
        return answer;
    }
}