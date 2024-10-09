import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String> visited = new HashSet<>();
        int[] current = {0,0};
        int[] before = {0,0};
        for(int i = 0; i < dirs.length();i++){
            char currentMove = dirs.charAt(i);
            before[0] = current[0];
            before[1] = current[1];
            if(currentMove=='U' && current[1]+1 <6){
                current[1] += 1;
            } else if(currentMove=='D' && current[1]-1 >-6){
                current[1] -= 1;
            } else if(currentMove=='R' && current[0]+1 <6){
                current[0] += 1;
            } else if(currentMove=='L' && current[0]-1 >-6){
                current[0] -= 1;
            } else{
                continue;
            }
            
            String path1 = before[0] + "," + before[1] + "->" + current[0] + "," + current[1];
            String path2 = current[0] + "," + current[1] + "->" + before[0] + "," + before[1];
            
            if(!visited.contains(path1) && !visited.contains(path2)){
                visited.add(path1);
                visited.add(path2);
                answer++;
            }
        }
        return answer;
    }
}