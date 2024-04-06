class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String str = s;
        while(!(str.equals("1"))){
            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i)=='0'){
                    answer[1]++;
                }
            }
            str = str.replaceAll("0", "");
            answer[0]++;
            str = Integer.toBinaryString(str.length());
        }
        return answer;
    }
}