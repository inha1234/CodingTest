import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        while(len<arr.length){
            len *= 2;
        }
        int[] answer = Arrays.copyOf(arr, len);
        return answer;
    }
}