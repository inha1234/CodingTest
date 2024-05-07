class Solution{
    public int solution(int n, int a, int b){
        int answer = 0;
        int tmpA = a;
        int tmpB = b;
        while(tmpA!=tmpB){
            tmpA = (tmpA+1)/2;
            tmpB = (tmpB+1)/2;
            answer++;
        }
        return answer;
    }
}