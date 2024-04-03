class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] str = s.split(" ");
        for(String i : str){
            max = Math.max(Integer.parseInt(i), max);
            min = Math.min(Integer.parseInt(i), min);
        }
        answer = min + " " +max;
        return answer;
    }
}