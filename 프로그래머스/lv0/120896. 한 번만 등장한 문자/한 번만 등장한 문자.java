class Solution {
    public String solution(String s) {
        String answer = "";
        int[] num = new int[26];
        for(int i = 0; i<s.length(); i++) num[s.charAt(i)-97]++;
        for(int i = 0; i<num.length; i++){
            if(num[i]==1) answer += (char)(i+97);
        }
        return answer;
    }
}