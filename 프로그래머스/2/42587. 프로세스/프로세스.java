import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        Integer[] rev = new Integer[priorities.length];
        for(int i = 0 ; i < priorities.length; i++){
            rev[i] = priorities[i];
        }
        Arrays.sort(rev, Collections.reverseOrder());
        for(int i : rev){
            que.add(i);
        }
        w1:
        while(!que.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(priorities[i]==que.peek()){
                    que.poll();
                    answer++;
                    if(i == location){
                        break w1;
                    }
                }
            }
        }
        return answer;
    }
}