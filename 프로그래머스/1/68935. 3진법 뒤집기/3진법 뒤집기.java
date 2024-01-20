class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = n;
        String str = "";
        while(tmp>0){
            str += "" + tmp%3;
            tmp /= 3;
        }
        int num = 1;
        for(int i = str.length()-1; i >= 0; i--){
            answer += Character.getNumericValue(str.charAt(i))*num;
            num *= 3;
        }
        return answer;
    }
}