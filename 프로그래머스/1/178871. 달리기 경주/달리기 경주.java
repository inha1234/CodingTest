import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playersMap = new HashMap<>();
        for(int i = 0; i< players.length; i++){
            playersMap.put(players[i], i);
        }
        for(String call:callings){
            int i = playersMap.get(call);
            String tmp = players[i-1];
            players[i-1] = call;
            players[i] = tmp;
            playersMap.put(call, i-1);
            playersMap.put(tmp, i);
        }
        return players;
    }
}