import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0 ; i < bridge_length; i++){
            que.add(0);
        }
        int cur = 0;
        int idx = 0;
        while(!que.isEmpty()){
            cur -= que.poll();
            if(idx<truck_weights.length){
                if(cur + truck_weights[idx]<=weight){
                    que.add(truck_weights[idx]);
                    cur += truck_weights[idx++];
                } else{
                    que.add(0);
                }
            }
            
            answer++;
        }
        return answer;
    }
}