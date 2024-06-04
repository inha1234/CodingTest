class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)right-(int)left+1];
        int idx = (int)(left/n)+1;
        int start = (int)(left%n);
        for(int i = 0; i< answer.length; i++){
            if(start<idx){
                answer[i] = idx;
                start++;
            } else{
                answer[i] = 1+start++;
                
            }
            
            if(start>=n){
                start -= n;
                idx++;
            }
        }
        return answer;
    }
}