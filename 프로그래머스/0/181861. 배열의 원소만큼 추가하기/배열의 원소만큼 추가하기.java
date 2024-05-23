class Solution {
    public int[] solution(int[] arr) {
        int aSum = 0;
        for(int i : arr){
            aSum += i;
        }
        int[] answer = new int[aSum];
        int idx =0;
        for(int i : arr){
            for(int j = 0; j < i; j++){
                answer[idx++] = i;
            }
        }
        return answer;
    }
}