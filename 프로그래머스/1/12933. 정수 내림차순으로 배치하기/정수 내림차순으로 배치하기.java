class Solution {
    public long solution(long n) {
        long answer = 0;
        String numStr = String.valueOf(n);
        int[] arr = new int[10];
        long cnt = 1;
        for(int i = 0; i < numStr.length(); i++){
            arr[numStr.charAt(i)-'0']++;
        }
        for(int i = 0; i < 10; i++){
            if(arr[i]>0){
                for(int j = 0; j < arr[i]; j++){
                    answer += i*cnt;
                    cnt *= 10;
                }
            }
        }
        return answer;
    }
}