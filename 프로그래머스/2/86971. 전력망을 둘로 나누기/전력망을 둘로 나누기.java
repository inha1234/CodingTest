import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i <= n; i++){
            list.add(new ArrayList<>());
        }
        
        for(int i = 0; i < wires.length; i++){
            int a = wires[i][0];
            int b = wires[i][1];
            
            list.get(b).add(a);
            list.get(a).add(b);
        }
        
        for(int i = 0; i < wires.length; i++){
            int a = wires[i][0];
            int b = wires[i][1];
            
            boolean[] visited = new boolean[n + 1];
            Queue<Integer> que = new ArrayDeque<>();
            que.add(a);
            visited[a] = true;
            int cnt = 1;
            
            while(!que.isEmpty()){
                int cur = que.poll();
                for(int nxt : list.get(cur)){
                    if((cur == a && nxt == b) || (cur == b && nxt == a)){
                        continue;
                    }
                    if(!visited[nxt]){
                        visited[nxt] = true;
                        que.add(nxt);
                        cnt++;
                    }
                }
            }
            int diff = Math.abs(n - 2*cnt);
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
}

/*풀이과정 
주어진 배열을 인접리스트로 변환하고 모든 간선을 하나씩 선택해서 끊고 한쪽 컴포넌트의 크기를 센 다음 차이를 계산해서 최솟값 갱신
중복 방문을 방지하기위해 n+1의 boolean 배열을 생성하고, wires 배열의 간선을 한번씩 다 끊어서 갯수를 세기 위해 현재 간선을 a로 주고 인접 리스트에서 a와 연결된 모든 간선을 확인한다음 갯수를 세기위해 queue에 add한 다음 현재 진행중인 wires의 2번째 항은 넘기고 연결되어있는 모든 간선의 수를 센다. 한쪽의 수가 cnt이고 다른 쪽은 n-cnt인데 구해야하는 것은 양쪽의 네트워크 차가 최대한 비슷한 값을 구해야하니 n-cnt-cnt 이므로 n-2*cnt로 계산하여 이 값이 가장 적은 수를 구한다.
*/