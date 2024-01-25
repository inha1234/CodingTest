class Solution {
    public int[] solution(long n) {
        int num = (int) Math.log10(n)+1 == 0 ? 1 : (int) Math.log10(n)+1;
        long tmp = n;
        int[] answer = new int[num];
        for(int i = 0; i < num; i++){
            answer[i] = (int)(tmp%10);
            tmp /= 10;
        }
        return answer;
    }
}