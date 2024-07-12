import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        cities = Arrays.stream(cities)
            .map(String::toUpperCase)
            .toArray(String[]::new);
        Queue<String> que = new LinkedList<>();
        for(String str : cities){
            if(que.contains(str)){
                que.remove(str);
                que.offer(str);
                answer++;
            } else{
                if(cacheSize==0){
                    answer += 5;
                } else if(que.size()<cacheSize){
                    que.offer(str);
                    answer += 5;
                } else{
                    que.poll();
                    que.offer(str);
                    answer += 5;
                }
            }
        }
        
        return answer;
    }
}