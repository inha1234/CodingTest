import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] strNum = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            strNum[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNum, (a, b) -> (b + a).compareTo(a + b));
        if(strNum[0].equals("0")){
            return "0";
        }
        for(String str : strNum){
            answer.append(str);
        }
        return answer.toString();
    }
}