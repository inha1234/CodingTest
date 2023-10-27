class Solution {
    public int[] solution(int[][] score) {
        double[] temp = new double[score.length];
        for(int i = 0; i<score.length; i++){
            temp[i] = (score[i][0]+score[i][1])/2.0;
        }
        
        int[] answer = new int[score.length];
        for(int i = 0; i<score.length; i++){
            int rank = 1;
            
            for(int j = 0; j<score.length; j++){
                if(temp[i]<temp[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}