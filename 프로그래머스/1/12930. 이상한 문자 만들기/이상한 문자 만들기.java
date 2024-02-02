class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==' '){
                cnt = 0;
                str.append(s.charAt(i));
            } else{
                if(cnt%2==0){
                    str.append(Character.toUpperCase(s.charAt(i)));
                } else{
                    str.append(Character.toLowerCase(s.charAt(i)));
                }
                cnt++;
            }
        }
        answer = String.valueOf(str);
        return answer;
    }
}