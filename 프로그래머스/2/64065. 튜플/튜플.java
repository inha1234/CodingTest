import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[0];
        String tmp = s;
        tmp = tmp.replaceAll("[{}]", " ");
        String[] str = tmp.trim().split(" , ");
        Arrays.sort(str, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        answer = Arrays.copyOf(answer, str.length);
        Set<Integer> seen = new HashSet<>();
        int idx = 0;
        for(String group : str){
            for(String numStr : group.split(",")){
                int num = Integer.parseInt(numStr);
                if(seen.add(num)){
                    answer[idx++] = num;
                }
            }
        }
        return answer;
    }
}