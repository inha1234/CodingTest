class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String str = s.toLowerCase();
        boolean isActive = false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==' '){
                isActive = true;
                answer.append(str.charAt(i));
            } else if(isActive || i==0){
                isActive = false;
                answer.append(Character.toUpperCase(str.charAt(i)));
            } else{
                answer.append(str.charAt(i));
            }
        }
        return answer.toString();
    }
}