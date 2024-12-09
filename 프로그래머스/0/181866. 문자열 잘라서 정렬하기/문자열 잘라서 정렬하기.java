import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
        
        List<String> filterList = new ArrayList<>();
        for(String part : parts){
            if(!part.isEmpty()){
                filterList.add(part);
            }
        }
        String[] answer = filterList.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}