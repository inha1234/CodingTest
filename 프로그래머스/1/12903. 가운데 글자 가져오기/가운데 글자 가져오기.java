class Solution {
    public String solution(String s) {
        String answer = "";
        int num = s.length();
        if(num%2==0){
            answer = s.substring(num/2-1, num/2+1);
        } else{
            answer = String.valueOf(s.charAt(num/2));
        }
        return answer;
    }
}