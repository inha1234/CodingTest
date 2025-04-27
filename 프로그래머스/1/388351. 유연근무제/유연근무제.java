class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i = 0; i < schedules.length; i++){
            int idx = 0;
            for(int j = 0; j < 7; j++){
                if((startday+j)%7==6 || (startday+j)%7==0){
                    continue;
                }
                int tmp = (schedules[i]+10);
                if((schedules[i]+10)%100>=60){
                    tmp = (schedules[i]+10)-60+100;
                }
                if(tmp<timelogs[i][j]){
                    break;
                }
                idx++;
            }
            if(idx==5){
                answer++;
            }
        }
        return answer;
    }
}