import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int tmp = budget;
        for(int i = 0; i < d.length; i++){
            if(d[i]<=tmp){
                answer++;
                tmp -= d[i];
            }
        }
        return answer;
    }
}