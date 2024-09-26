class Solution {
    public int solution(String word) {
        int answer = 0;
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        int[] weights = {781, 156, 31, 6, 1};
        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < vowels.length; j++){
                if(word.charAt(i)==vowels[j]){
                    answer += weights[i]*j+1;
                }
            }
        }
        return answer;
    }
}