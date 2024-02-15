class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] num = new int[n+1];
        for(int i : lost){
            num[i]--;
        }
        for(int i : reserve){
            num[i]++;
        }
        for(int i = 1; i < num.length; i++){
            if(num[i]==-1){
                if(i-1>=1 && num[i-1]==1){
                    num[i]++;
                    num[i-1]--;
                } else if(i+1<=n && num[i+1]==1){
                    num[i]++;
                    num[i+1]--;
                }
            }
        }
        for(int i : num){
            if(i==-1){
                answer--;
            }
        }
        return answer;
    }
}