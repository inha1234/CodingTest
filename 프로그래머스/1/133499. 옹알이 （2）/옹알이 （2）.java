class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya","ye","woo","ma"};
        String tmp = "";
        for(int i = 0; i < babbling.length; i++){
            tmp = babbling[i];
            for(int j = 0; j < str.length; j++){
                if(tmp.contains(str[j]+str[j])){
                    continue;
                }
                tmp = tmp.replace(str[j], " ");
            }
            tmp = tmp.replace(" ", "");
            if(tmp.equals("")){
                answer++;
            }
        }
        return answer;
    }
}