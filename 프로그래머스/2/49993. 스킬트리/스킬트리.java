import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < skill.length(); i++){
            map.put(skill.charAt(i),i);
        }
        for(int i = 0; i < skill_trees.length; i++){
            int idx = 0;
            for(int j = 0; j < skill_trees[i].length(); j++){
                if(map.containsKey(skill_trees[i].charAt(j))){
                    if(map.get(skill_trees[i].charAt(j))==idx){
                        idx++;
                    } else{
                        break;
                    }
                }
                if(j==skill_trees[i].length()-1){
                    answer++;
                }
            }
        }
        return answer;
    }
}