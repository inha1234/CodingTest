class Solution {
    public int solution(int[] numbers, int target) {
        int answer = sol(numbers, target, 0, 0);
        return answer;
    }
    
    private int sol(int[] numbers, int target, int tmp, int idx){
        if(idx==numbers.length){
            if(tmp==target){
                return 1;
            } else{
                return 0;
            }
        }
        int num1 = sol(numbers, target, tmp + numbers[idx], idx+1);
        int num2 = sol(numbers, target, tmp - numbers[idx], idx+1);
        return num1 + num2;
    }
}