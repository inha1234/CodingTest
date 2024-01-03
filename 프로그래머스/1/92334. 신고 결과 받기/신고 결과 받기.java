import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, Integer> mail = new HashMap<>();
        for(int i = 0; i < id_list.length; i++){
            map.put(id_list[i], new HashSet<String>());
            map2.put(id_list[i],0);
            mail.put(id_list[i],0);
        }
        
        for(int i = 0; i < report.length; i++){
            String[] user = report[i].split(" ");
            if(map.get(user[1]).add(user[0])){
                map2.put(user[1], map2.get(user[1])+1);
            }
        }
        
        for(int i = 0; i < id_list.length; i++){
            int tmp = map2.get(id_list[i]);
            if(tmp>=k){
                for(String value : map.get(id_list[i])){
                    mail.put(value, mail.get(value)+1);
                }
            }
        }
        
        for(int i = 0; i < id_list.length; i++){
            answer[i] = mail.get(id_list[i]);
        }
        
        return answer;
    }
}