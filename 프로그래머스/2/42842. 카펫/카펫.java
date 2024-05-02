class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int y = 1;
        while(true){
            int tmp = yellow;
            if(tmp%y!=0){
                y++;
                continue;
            }
            
            if(brown==(yellow/y*2)+y*2+4){
                answer[1] = y+2;
                answer[0] = (brown+yellow)/answer[1];
                break;
            }
            y++;
        }
        return answer;
    }
}