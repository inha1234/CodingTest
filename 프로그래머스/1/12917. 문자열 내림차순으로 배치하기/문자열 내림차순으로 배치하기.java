import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split("");
        Arrays.sort(list);
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < list.length; i++){
            str.append(list[i]);
        }
        str.reverse();
        answer = String.valueOf(str);
        return answer;
    }
}