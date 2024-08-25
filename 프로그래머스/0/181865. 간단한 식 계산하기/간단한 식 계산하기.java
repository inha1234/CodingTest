class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] tmp = binomial.split(" ");
        answer = Integer.parseInt(tmp[0]);
        if(tmp[1].equals("+")){
            answer += Integer.parseInt(tmp[2]);
        } else if(tmp[1].equals("-")){
            answer -= Integer.parseInt(tmp[2]);
        } else if(tmp[1].equals("*")){
            answer *= Integer.parseInt(tmp[2]);
        }
        return answer;
    }
}