import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< keymap.length; i++){
            for(int j = 0; j< keymap[i].length(); j++){
                if(!map.containsKey(keymap[i].charAt(j))){
                    map.put(keymap[i].charAt(j), j+1);
                } else if(map.get(keymap[i].charAt(j))>j+1){
                    map.put(keymap[i].charAt(j), j+1);
                }
            }
        }
        for(int i = 0; i< targets.length; i++){
            for(int j = 0; j< targets[i].length(); j++){
                if(map.containsKey(targets[i].charAt(j))){
                    answer[i] += map.get(targets[i].charAt(j));
                } else{
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}