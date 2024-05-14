class Solution {
    public String solution(String n_str) {
        StringBuilder answer = new StringBuilder();
        boolean bool = false;
        for(int i = 0; i < n_str.length(); i++){
            if(bool){
                answer.append(n_str.charAt(i));
            } else if(n_str.charAt(i)!='0'){
                bool = true;
                answer.append(n_str.charAt(i));
            }
        }
        return answer.toString();
    }
}