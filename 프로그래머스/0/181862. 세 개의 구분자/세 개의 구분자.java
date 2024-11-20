import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        String[] parts = myStr.split("[abc]");
        List<String> answer = new ArrayList<>();
        for(String part : parts){
            if(!part.isEmpty()){
                answer.add(part);
            }
        }
        if(answer.isEmpty()){
            return new String[] {"EMPTY"};
        }
        return answer.toArray(new String[0]);
    }
}