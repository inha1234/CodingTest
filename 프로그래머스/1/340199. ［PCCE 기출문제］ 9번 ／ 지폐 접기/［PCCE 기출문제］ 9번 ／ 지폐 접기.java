class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int idx = 0;
        while(true){
            if(wallet[0]>=bill[0] && wallet[1]>=bill[1]){
                break;
            } else if(wallet[0]>=bill[1] && wallet[1]>=bill[0]){
                break;
            }
            answer++;
            if(bill[0]>bill[1]){
                bill[0] /= 2;
            } else{
                bill[1] /= 2;
            }
        }
        return answer;
    }
}