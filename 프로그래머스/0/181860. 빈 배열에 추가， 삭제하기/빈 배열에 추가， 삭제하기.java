import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < flag.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i]*2; j++){
                    list.add(arr[i]);
                }
            } else{
                for(int j = 0; j < arr[i]; j++){
                    if(!(list.isEmpty())){
                        list.remove(list.size()-1);
                    }
                }
            }
        }
        answer = list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}