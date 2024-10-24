import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        Queue<String> que = new LinkedList<>();
        for(int i = 0; i < record.length; i++){
            String[] tmp = record[i].split(" ");
            if(!tmp[0].equals("Leave")){
                map.put(tmp[1], tmp[2]);
            }
            if(!tmp[0].equals("Change")){
                que.add(tmp[0] + " " + tmp[1]);
            }
        }
        String[] answer = new String[que.size()];
        int idx = 0;
        while(!que.isEmpty()){
            String[] tmp2 = que.poll().split(" ");
            if(tmp2[0].equals("Enter")){
                answer[idx++] = map.get(tmp2[1]) + "님이 들어왔습니다.";
            } else{
                answer[idx++] = map.get(tmp2[1]) + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}