import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        int first = 0;
        int second = 0;
        for(int i : scoville){
            que.offer(i);
        }
        while(que.size()>1&&que.peek()<K){
            first = que.poll();
            second = que.poll();
            que.offer(first + second*2);
            answer++;
        }
        if(que.peek()<K){
            return -1;
        }
        return answer;
    }
}