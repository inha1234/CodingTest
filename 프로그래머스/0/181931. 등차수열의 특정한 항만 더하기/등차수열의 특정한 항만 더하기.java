class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] num = new int[included.length];
        num[0] = a;
        if(included[0]){
            answer += num[0];
        }
        for(int i = 1; i < num.length; i++){
            num[i] = num[i-1] + d;
            if(included[i]){
                answer += num[i];
            }
        }
        return answer;
    }
}