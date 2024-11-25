import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int firstIdx = -1;
        int lastIdx = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==2){
                if(firstIdx==-1){
                    firstIdx = i;
                }
                lastIdx = i;
            }
        }
        if(firstIdx==-1){
            return new int[]{-1};
        }
        int[] answer = Arrays.copyOfRange(arr, firstIdx, lastIdx+1);
        return answer;
    }
}