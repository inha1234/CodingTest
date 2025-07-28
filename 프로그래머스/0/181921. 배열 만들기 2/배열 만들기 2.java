import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new LinkedList<>();
        f1:
        for(int i = l; i <= r; i++){
            int tmp = i;
            while(tmp>0){
                if(tmp%10!=0 && tmp%10!=5){
                    continue f1;
                }
                tmp /= 10;
            }
            list.add(i);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        if(list.isEmpty()){
            return new int[]{-1};
        }
        return answer;
    }
}