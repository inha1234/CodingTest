import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < order.length; i++){
            if(order[answer]==(i+1)){
                answer++;
            } else{
                stack.push(i+1);
            }
            while(!stack.isEmpty()){
                if(order[answer]==stack.peek()){
                    stack.pop();
                    answer++;
                } else{
                    break;
                }
            }
        }
        return answer;
    }
}