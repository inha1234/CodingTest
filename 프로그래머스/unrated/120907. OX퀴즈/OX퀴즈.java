class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i<quiz.length; i++){
            String[] splitStr = quiz[i].split(" ");
            int num = Integer.parseInt(splitStr[0]);
            if(splitStr[1].equals("+")){
                num += Integer.parseInt(splitStr[2]);
            } else if(splitStr[1].equals("-")){
                num -= Integer.parseInt(splitStr[2]);
            }
            if(num==Integer.parseInt(splitStr[4])){
                answer[i] = "O";
            } else{
                answer[i] = "X";
            }
        }
        return answer;
    }
}