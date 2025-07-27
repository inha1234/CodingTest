import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                map.put(rank[i], i);
            }
        }
        Arrays.sort(rank);
        boolean a = true;
        boolean b = true;
        boolean c = true;
        for(int i = 0; i < rank.length; i++){
            if(map.containsKey(rank[i])){
                if(a){
                    answer += map.get(rank[i])*10000;
                    a = false;
                } else if(b){
                    answer += map.get(rank[i])*100;
                    b = false;
                } else if(c){
                    answer += map.get(rank[i]);
                    break;
                }
            }
        }
        return answer;
    }
}