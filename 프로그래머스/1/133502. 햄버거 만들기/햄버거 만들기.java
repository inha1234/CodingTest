import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
        for(int i : ingredient){
            if(stack.size() >= 3&& i==1){
                int tmp1 = stack.pop();
                int tmp2 = stack.pop();
                int tmp3 = stack.pop();
                if(tmp1 == 3 && tmp2 == 2 && tmp3 == 1){
                    answer++;
                    continue;
                } else{
                    stack.push(tmp3);
                    stack.push(tmp2);
                    stack.push(tmp1);
                }
            }
            stack.push(i);
        }
        return answer;
    }
}