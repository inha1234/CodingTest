import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        int i = 0;
        for(String[] row : photo){
            for(int j =0; j<row.length; j++){
                if(map.containsKey(row[j])){
                    answer[i] += map.get(row[j]);
                }
            }
            i++;
        }
        return answer;
    }
}