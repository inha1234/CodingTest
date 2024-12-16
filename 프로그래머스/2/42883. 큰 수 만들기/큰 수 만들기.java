import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int cnt = k;
        for(int i = 0; i < number.length(); i++){
            char current = number.charAt(i);
            while(!stack.isEmpty() && stack.peek() < current && cnt>0){
                stack.pop();
                cnt--;
            }
            stack.push(current);
        }
        
        while(cnt>0){
            stack.pop();
            cnt--;
        }
        for(char c : stack){
            answer.append(c);
        }
        return answer.toString();
    }
}