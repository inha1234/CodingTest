import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;
        int tmp = n;
        while(tmp!=1){
            if(tmp%2==0){
                tmp /= 2;
            } else{
                tmp -= 1;
                ans += 1;
            }
        }
        return ans;
    }
}