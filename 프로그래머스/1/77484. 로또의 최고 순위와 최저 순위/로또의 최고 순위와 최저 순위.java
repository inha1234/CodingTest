import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int tmp = 7;
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< win_nums.length; i++){
            list.add(win_nums[i]);
        }
        for(int i = 0; i< lottos.length; i++){
            if(lottos[i]==0){
                cnt++;
            } else if(list.contains(lottos[i])){
                tmp--;
            }
        }
        answer[0] = (tmp-cnt)>6 ? 6 : tmp-cnt;
        answer[1] = tmp>6 ? 6 : tmp;
        return answer;
    }
}