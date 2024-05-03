class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1; i < arr.length; i++){
            int a = answer;
            int b = arr[i];
            while(b!=0){
                int r = a%b;
                a = b;
                b = r;
            }
            answer = (answer * arr[i])/a;
        }
        return answer;
    }
}