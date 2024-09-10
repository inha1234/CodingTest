class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String str = Integer.toString(n, k);
        String[] sub = str.split("0+");
        F1:
        for(String numStr : sub){
            Long num = Long.parseLong(numStr);
            if(num>=2){
                for(long i = 2; i*i <= num; i++){
                    if(num%i == 0){
                        continue F1;
                    }
                }
                answer++;
            }
        }
        return answer;
    }
}