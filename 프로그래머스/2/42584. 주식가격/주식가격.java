import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1; i < prices.length; i++){
            while(!stack.isEmpty()&&prices[stack.peek()]>prices[i]){
                answer[stack.peek()] = i-stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            answer[stack.peek()] = prices.length - stack.pop()-1;
        }
        return answer;
    }
}