class Solution {
    public int solution(String s) {
        int answer = 1;
        int cnt = 1;
        int cnt2 = 0;
        boolean chek = false;
        char stand = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if(chek){
                chek = false;
                stand = s.charAt(i);
                answer++;
                continue;
            }
            if(stand==s.charAt(i)){
                cnt++;
            } else{
                cnt2++;
            }
            if(cnt==cnt2){
                cnt = 1;
                cnt2 = 0;
                chek = true;
            }
        }
        return answer;
    }
}