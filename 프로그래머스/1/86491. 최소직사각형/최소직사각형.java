class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int idx = 0;
        int tmp = 0;
        for(int i = 0; i < sizes.length; i++){
            if(max<sizes[i][0] || max<sizes[i][1]){
                max = sizes[i][0]>sizes[i][1] ? sizes[i][0] : sizes[i][1];
                idx = i;
            } else if(max==sizes[i][0] || max==sizes[i][1]){
                if(sizes[i][0]==sizes[idx][0]){
                    idx = sizes[idx][1]>sizes[i][01] ? idx : i;
                } else{
                    idx = sizes[idx][0]>sizes[i][0] ? idx : i;
                }
            }
        }
        tmp = max>sizes[idx][0] ? sizes[idx][0] : sizes[idx][1]; //제일 큰 수의 반대쪽 길이
        for(int i = 0; i< sizes.length; i++){
            if(idx!=i){
                if(tmp<sizes[i][0] && tmp<sizes[i][1]){
                    tmp = sizes[i][0]>sizes[i][1] ? sizes[i][1] : sizes[i][0];
                }
            }
        }
        answer = max*tmp;
        return answer;
    }
}