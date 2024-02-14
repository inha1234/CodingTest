class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] score = new String[3];
        int[] num = new int[3];
        int cnt = 0;
        int idx = 0;
        for(int i = 0; i < dartResult.length(); i++){
            if(dartResult.charAt(i)=='S' || dartResult.charAt(i)=='D' || dartResult.charAt(i)=='T'){
                if(i!=dartResult.length()-1 && (dartResult.charAt(i+1)=='*' || dartResult.charAt(i+1)=='#')){
                    score[cnt++] = dartResult.substring(idx, i+2);
                    idx = i+2;
                } else{
                    score[cnt++] = dartResult.substring(idx, i+1);
                    idx = i+1;
                }
            }
        }
        for(int i = 0; i < score.length; i++){
            for(int j = 0; j < score[i].length(); j++){
                if(score[i].charAt(j)>='1' && score[i].charAt(j)<='9'){
                    if(score[i].charAt(j+1)=='0'){
                        num[i] = 10;
                    } else{
                        num[i] = score[i].charAt(j)-'0';
                    }
                }
                if(score[i].charAt(j)=='D'){
                    num[i] = num[i]*num[i];
                } else if(score[i].charAt(j)=='T'){
                    num[i] = num[i]*num[i]*num[i];
                }
                if(score[i].charAt(j)=='*'){
                    if(i!=0){
                        num[i-1] *= 2;
                        num[i] *= 2;
                    } else{
                        num[i] *= 2;
                    }
                } else if(score[i].charAt(j)=='#'){
                    num[i] *= -1;
                }
            }
        }
        for(int i : num){
            answer += i;
        }
        return answer;
    }
}