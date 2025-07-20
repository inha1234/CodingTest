import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            StringBuilder temp = new StringBuilder(sb.substring(start, end + 1));
            temp.reverse();

            for (int i = 0; i < temp.length(); i++) {
                sb.setCharAt(start + i, temp.charAt(i));
            }
        }
        String answer = sb.toString();

        return answer;
    }
}