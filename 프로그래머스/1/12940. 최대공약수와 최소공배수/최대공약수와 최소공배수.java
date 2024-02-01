class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = Math.min(n,m);
        int b = Math.max(n,m);
        int tmp = 0;
        while(b!=0){
            tmp = a%b;
            a = b;
            b = tmp;
        }
        answer[0] = a;
        answer[1] = (n*m)/a;
        return answer;
    }
}