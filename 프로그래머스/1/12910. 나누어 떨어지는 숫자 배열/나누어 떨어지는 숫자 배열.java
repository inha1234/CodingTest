import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        if(list.size()==0){
            return new int[]{-1};
        }
        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}