class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int crads1Cnt = 0;
        int crads2Cnt = 0;
        for(int i = 0; i<goal.length; i++){
            if(crads1Cnt<cards1.length&&goal[i].equals(cards1[crads1Cnt])){
                crads1Cnt++;
            } else if(crads2Cnt<cards2.length&&goal[i].equals(cards2[crads2Cnt])){
                crads2Cnt++;
            } else{
                return "No";
            }
        }
        return answer;
    }
}