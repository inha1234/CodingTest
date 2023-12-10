import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int cnt = index;
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < skip.length(); i++){
            list.add(skip.charAt(i));
        }
        for(int i = 0; i < s.length(); i++){
            char chr = s.charAt(i);
            cnt = index;
            for(int j = 0; j < cnt; j++){
                chr += 1; 
                if(chr>122){
                    chr -= 26;
                }
                
                if(list.contains(chr)){
                    cnt++;
                }
            }
            answer += "" + chr;
        }
        return answer;
    }
}