import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        for(int i : delete_list){
            if(list.contains(i)){
                list.remove(Integer.valueOf(i));
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}