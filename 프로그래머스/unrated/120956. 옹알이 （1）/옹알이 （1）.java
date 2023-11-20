class Solution {
    public int solution(String[] babbling) {
        String[] patterns = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(String word : babbling){
            for(int i = 0; i<patterns.length; i++){
                word = word.replace(patterns[i], " ");
            }
            word = word.replaceAll(" ", "");
            if(word.equals("")){
                answer++;
            }
        }
        return answer;
    }
}