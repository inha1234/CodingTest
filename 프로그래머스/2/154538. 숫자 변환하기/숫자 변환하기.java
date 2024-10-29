import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        if(x==y){
            return answer;
        }
        Queue<Integer> que = new LinkedList<>();
        boolean[] visited = new boolean[y+1];
        que.add(x);
        visited[x] = true;
        while(!que.isEmpty()){
            int size = que.size();
            answer++;
            
            for(int i = 0; i < size; i++){
                int current = que.poll();
                
                int[] moves = {current + n, current*2, current*3};
                for(int next : moves){
                    if(next==y){
                        return answer;
                    } else if(next < y && !visited[next]){
                        que.add(next);
                        visited[next] = true;
                    }
                }
            }
        }
        answer = -1;
        return answer;
    }
}