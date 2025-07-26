class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder strB = new StringBuilder();
        for(int i = 0; i < s; i++){
            strB.append(my_string.charAt(i));
        }
        for(int i = 0; i < overwrite_string.length(); i++){
            strB.append(overwrite_string.charAt(i));
        }
        for(int i = overwrite_string.length()+s; i < my_string.length(); i++){
            strB.append(my_string.charAt(i));
        }
        
        answer = strB.toString();
        return answer;
    }
}