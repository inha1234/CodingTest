

class Solution {
    public String solution(String code) {
        StringBuilder str = new StringBuilder();
        int mode = 0;
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i)=='1'){
                if(mode == 0){
                    mode = 1;
                } else if(mode == 1){
                    mode = 0;
                }
                continue;
            }
            if(mode == 0){
                if(i%2==0){
                    str.append(code.charAt(i));
                }
            } else if(mode == 1){
                if(i%2!=0){
                    str.append(code.charAt(i));
                }
            }
        }
        if(str.length()==0){
            return "EMPTY";
        }
        String answer = str.toString();
        return answer;
    }
}