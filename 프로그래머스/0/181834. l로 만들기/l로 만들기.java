class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i)<='l' && myString.charAt(i)>='a'){
                str.append('l');
            } else{
                str.append(myString.charAt(i));
            }
        }
        answer = str.toString();
        return answer;
    }
}