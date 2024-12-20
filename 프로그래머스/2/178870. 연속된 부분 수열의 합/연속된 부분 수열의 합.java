class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0, sequence.length};
        int start = 0;
        int end = 0;
        int sum = 0;
        int cnt = 0;
        while(end < sequence.length){
            sum += sequence[end];
            while(sum>=k){
                if(sum == k){
                    if(cnt<answer[1]-answer[0]){
                        answer[0] = start;
                        answer[1] = end;
                    }
                }
                sum -= sequence[start];
                start++;
                cnt--;
            }
            cnt++;
            end++;
        }
        return answer;
    }
}