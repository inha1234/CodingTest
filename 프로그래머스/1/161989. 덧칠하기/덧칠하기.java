class Solution {
    public int solution(int n, int m, int[] section) {
        int cnt = 0;
        int tmp = 0;
        for(int i = 0; i<section.length; i++){
            if(section[i]>=tmp){
                cnt++;
                tmp = section[i]+m;
            }
        }
        return cnt;
    }
}