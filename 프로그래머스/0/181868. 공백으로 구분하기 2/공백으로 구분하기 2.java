class Solution {
    public String[] solution(String my_string) {
        String tmp = my_string.trim().replaceAll("\\s+", " ");
        String[] answer = tmp.split(" ");
        return answer;
    }
}