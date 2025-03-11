import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int num : arr){
            if(stack.isEmpty()){
                stack.push(num);
            } else if(stack.peek()==num){
                stack.pop();
            } else if(stack.peek()!=num){
                stack.push(num);
            }
        }
        if(stack.isEmpty()){
            return new int[]{-1};
        }
        answer = stack.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}