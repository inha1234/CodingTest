class Solution {
    private int max = 0;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        boolean[] visit = new boolean[dungeons.length];
        cal(k, dungeons, visit, 0);
        answer = max;
        return answer;
    }
    
    private void cal(int k, int[][] dungeons, boolean[] visit, int count){
        max = Math.max(count, max);
        for(int i = 0; i < dungeons.length; i++){
            if(!(visit[i]) && k >= dungeons[i][0]){
                visit[i] = true;
                cal(k-dungeons[i][1], dungeons, visit, count+1);
                visit[i] = false;
            }
        }
    }
}