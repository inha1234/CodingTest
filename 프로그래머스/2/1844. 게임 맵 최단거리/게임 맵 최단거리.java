import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        int n = maps.length;
        int m = maps[0].length;
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0,0});
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        int answer = -1;
        
        while(!que.isEmpty()){
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            
            if(x == n -1 && y == m-1){
                return maps[x][y];
            }
            
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= 0 && ny>= 0 && nx < n && ny < m && maps[nx][ny] ==1 && !visited[nx][ny]){
                    que.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    maps[nx][ny] = maps[x][y]+1;
                }
            }
        }
        return answer;
    }
}