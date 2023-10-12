class Solution {
    public int solution(String my_string) {
        String[] temp = my_string.split(" ");
        int answer = Integer.parseInt(temp[0]);
        for(int i = 1; i < temp.length; i += 2){
            String operator = temp[i];
            int num = Integer.parseInt(temp[i+1]);
            if(operator.equals("+")){
                answer += num;
            } else if(operator.equals("-")){
                answer -= num;
            }
        }
        return answer;
    }
}