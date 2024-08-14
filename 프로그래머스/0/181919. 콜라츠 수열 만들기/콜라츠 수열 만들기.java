import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int tmp = n;
        while(tmp!=1){
            list.add(tmp);
            if(tmp%2==0){
                tmp /= 2;
            } else{
                tmp = (tmp*3)+1;
            }
        }
        list.add(1);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}