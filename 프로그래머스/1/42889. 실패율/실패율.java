import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] failStages = new int[N+2];
        int player = stages.length;
        HashMap<Double, String> map = new HashMap<>();
        for(int i = 0; i < stages.length; i++){
            failStages[stages[i]]++;
        }
        for(int i = 1; i < failStages.length-1; i++){
            if(map.containsKey((double)failStages[i]/player)){
                map.put((double)failStages[i]/player, 
                        map.get((double)failStages[i]/player) + "," + Integer.toString(i));
            } else{
                map.put((double)failStages[i]/player, Integer.toString(i));
            }
            player -= failStages[i];
            if(player==0){
                player = 1;
            }
        }
        ArrayList<Double> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, Collections.reverseOrder());
        int idx = 0;
        for(Double key : keys){
            String[] value = map.get(key).split(",");
            for(String str : value){
                answer[idx++] = Integer.parseInt(str);
            }
        }
        return answer;
    }
}