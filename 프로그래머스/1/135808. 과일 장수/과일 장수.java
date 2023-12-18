import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int box = score.length/m;
        if(box==0){
            return 0;
        }
        
        int min = Integer.MAX_VALUE;
        int idx = m;
        Arrays.sort(score);
        for(int i = score.length-1; i>=0; i--){
            idx--;
            if(min>score[i]){
                min = score[i];
            }
            if(idx==0){
                idx = m;
                answer += min*m;
                box--;
            }
            if(box==0){
                break;
            }
        }
        return answer;
    }
}