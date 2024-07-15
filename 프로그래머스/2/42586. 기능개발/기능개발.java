import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        if(progresses.length==1){
            return new int[]{1};
        }
        int[] answer = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++){
            answer[i] = (100 - progresses[i])/speeds[i];
            if((100 - progresses[i])%speeds[i]!=0){
                answer[i] += 1;
            }
        }
        int tmp = answer[0];
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < answer.length; i++){
            if(tmp<answer[i]){
                list.add(cnt);
                cnt = 1;
                tmp = answer[i];
            } else{
                cnt += 1;
            }
            if(i== answer.length-1){
                list.add(cnt);
            }
        }
        int[] answer2 = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer2[i] = list.get(i);
        }
        return answer2;
    }
}