class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        long tmp = 0;
        for(int i = 1; i< count+1; i++){
            tmp += price*(i);
        }
        
        return answer = answer-tmp<0 ? (answer-tmp)*-1 : 0;
    }
}