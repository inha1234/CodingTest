class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            answer[i] = arr[i];
        }
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}