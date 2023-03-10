class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] chr = my_string.toCharArray();
        char min;
        for(int i=0; i<chr.length; i++){
            for(int j=i+1; j<chr.length; j++){
                if(chr[i]>chr[j]){
                    min = chr[j];
                    chr[j] = chr[i];
                    chr[i] = min;
                }
            }
        }
        for(char c:chr) answer += c;
        return answer;
    }
}