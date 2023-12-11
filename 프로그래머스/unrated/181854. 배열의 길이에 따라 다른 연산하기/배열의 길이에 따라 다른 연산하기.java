class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        int standard = arr.length%2;
        for(int i = 0; i< arr.length; i++){
            if(!(i%2==standard)){
                answer[i] = arr[i]+n;
            } else{
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}