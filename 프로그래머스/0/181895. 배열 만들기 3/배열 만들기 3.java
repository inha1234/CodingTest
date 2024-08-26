class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int len = 0;
        for(int i = 0; i < intervals.length; i++){
            len += intervals[i][1]-intervals[i][0]+1;
        }
        int[] answer = new int[len];
        int idx = 0;
        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                answer[idx++] = arr[j];
            }
        }
        return answer;
    }
}