class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for(int i = 0; i< picture.length*k; i++){
            answer[i] = "";
            for(int j = 0; j < picture[i/k].length()*k; j++){
                answer[i] += picture[i/k].charAt(j/k);
            }
        }
        return answer;
    }
}