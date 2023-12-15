import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] highScore = new int[k];
        int idx = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<score.length; i++){
            if(idx<k-1){
                highScore[idx++] = score[i];
                min = min>score[i] ? score[i]:min;
                answer[i] = min;
                if(idx==k-1){
                    Arrays.sort(highScore);
                }
            } else{
                if(highScore[0]<score[i]){
                    highScore[0] = score[i];
                    Arrays.sort(highScore);
                    answer[i] = highScore[0];
                } else{
                    answer[i] = highScore[0];
                }
            }
        }
        return answer;
    }
}