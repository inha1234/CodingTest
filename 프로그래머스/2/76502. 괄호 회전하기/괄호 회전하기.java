import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.length()%2!=0){
            return 0;
        }
        StringBuilder str = new StringBuilder(s);
        for(int i = 0; i<s.length(); i++){
            if(isValid(str.toString())){
                answer++;
            }
            char tmp = str.charAt(0);
            str.append(tmp);
            str.deleteCharAt(0);
        }
        return answer;
    }
    
    private boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else{
                if(stack.isEmpty()){
                    return false;
                }
            char last = stack.pop();
            if(ch == ')' && last != '(') return false;
            if(ch == '}' && last != '{') return false;
            if(ch == ']' && last != '[') return false;
            }

        }
        return stack.isEmpty();
    }
}