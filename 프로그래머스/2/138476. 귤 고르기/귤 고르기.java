import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int size = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : tangerine){
            if(!map.containsKey(i)){
                size++;
            }
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Integer[] counts = new Integer[size];
        int idx = 0;
        for(int i : map.keySet()){
            counts[idx++] = map.get(i);
        }
        Arrays.sort(counts, Collections.reverseOrder());
        int tmp = 0;
        for(int i : counts){
            tmp += i;
            answer++;
            if(tmp>=k){
                break;
            }
        }
        return answer;
    }
}