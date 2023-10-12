import java.util.HashMap;
import java.util.Map;

class Solution {
    public long solution(String numbers) {
        Map<String, Integer> wordToNumber = new HashMap<>();
        wordToNumber.put("zero", 0);
        wordToNumber.put("one", 1);
        wordToNumber.put("two", 2);
        wordToNumber.put("three", 3);
        wordToNumber.put("four", 4);
        wordToNumber.put("five", 5);
        wordToNumber.put("six", 6);
        wordToNumber.put("seven", 7);
        wordToNumber.put("eight", 8);
        wordToNumber.put("nine", 9);
        int i = 0;
        long answer = 0;        
        while(i<numbers.length()){
            for(String word : wordToNumber.keySet()){
                if(numbers.startsWith(word,i)){
                    answer = answer*10 + wordToNumber.get(word);
                    i += word.length();
                    break;
                }
            }
        }
        return answer;
    }
}