class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder answer = new StringBuilder();
        int len1 = bin1.length()-1;
        int len2 = bin2.length()-1;
        int carry = 0;
        for(int i = len1, j = len2; i>=0||j>=0||carry==1; i--,j--){
            int sum = carry;
            if(i>=0){
                sum += bin1.charAt(i) - '0';
            }
            if(j>=0){
                sum += bin2.charAt(j) - '0';
            }
            answer.insert(0, sum%2);
            carry = sum/2;
        }
        return answer.toString();
    }
}
