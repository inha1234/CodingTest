import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < 26; i++){
            map.put(String.valueOf((char) ('A' + i)), i+1);
        }
        for(int i = 0; i < msg.length(); i++){
            String tmp = String.valueOf(msg.charAt(i));
            while(map.containsKey(tmp)){
                if(i+1<msg.length()){
                    String tmpStr = tmp;
                    tmpStr += String.valueOf(msg.charAt(i+1));
                    if(map.containsKey(tmpStr)){
                        tmp += String.valueOf(msg.charAt(i+1));
                    } else{
                        break;
                    }
                } else{
                    break;
                }
                i++;
            }
            list.add(map.get(tmp));
            if(i+1<msg.length()){
                tmp += String.valueOf(msg.charAt(i+1));
            }
            map.put(tmp, map.size()+1);
        }
        int[] answer = list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}