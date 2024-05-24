import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int len = elements.length;
        int[] ele = new int[len*2];
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < len; i++){
            ele[i] = elements[i];
            ele[i+len] = elements[i];
        }
        for(int i = 1; i<=len; i++){
            for(int start = 0; start < len; start++){
                int sum = 0;
                for(int curr = 0; curr<i; curr++){
                    sum += ele[start+curr];
                }
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }
}