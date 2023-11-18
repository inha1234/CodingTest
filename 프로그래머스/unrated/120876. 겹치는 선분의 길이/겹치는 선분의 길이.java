class Solution {
    public int solution(int[][] lines) {
        int[] tmp = new int[201];
        for(int[] a:lines){
            for(int i = a[0]+100; i<a[1]+100;i++){
                tmp[i]++;
            }
        }
        int answer = 0;
        for(int a:tmp){
            if(a>1){
                answer++;
            }
        }
        return answer;
    }
}