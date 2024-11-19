import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < strArr.length; i++){
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0)+1);
        }
        for(int i : map.values()){
            if(answer<i){
                answer = i;
            }
        }
        
        return answer;
    }
}