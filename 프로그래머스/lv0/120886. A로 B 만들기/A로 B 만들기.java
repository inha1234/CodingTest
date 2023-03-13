class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        for(int i=0; i<before.length(); i++){
            answer += before.charAt(i);
        }
        for(int i=0; i<after.length(); i++){
            answer -= after.charAt(i);
        }
        
        if(answer!=0) return 0;
        
        return 1;
    }
}