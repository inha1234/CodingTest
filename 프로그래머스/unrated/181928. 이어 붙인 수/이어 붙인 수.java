class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        for(int num : num_list){
            if(num%2!=0){
                num1.append(num);
            } else{
                num2.append(num);
            }
        }
        answer = Integer.parseInt(num1.toString())+Integer.parseInt(num2.toString());
        return answer;
    }
}