class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int cnt = 0;
        if(a%2!=0){
            cnt++;
        }
        if(b%2!=0){
            cnt++;
        }
        if(cnt==2){
            answer = a*a+b*b;
        } else if(cnt==1){
            answer = 2*(a+b);
        } else{
            answer = Math.abs(a-b);
        }
        
        return answer;
    }
}