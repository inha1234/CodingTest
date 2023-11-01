class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        if(denom1==denom2){
            answer[0] = numer1+numer2;
            answer[1] = denom1;
        } else{
            answer[0] = numer1*denom2+numer2*denom1;
            answer[1] = denom1*denom2;
        }
        int a = answer[0];
        int b = answer[1];
        while(b!=0){
            int tmp = b;
            b = a%b;
            a = tmp;
        }
        answer[0] /= a;
        answer[1] /= a;
        return answer;
    }
}