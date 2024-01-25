import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        long num = (long) n;
        while(num>0){
            answer += num%10;
            num /= 10;
        }
        return answer;
    }
}