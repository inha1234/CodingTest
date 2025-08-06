import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] tmp = {a,b,c,d};
        Arrays.sort(tmp);
        int answer = 0;
        if(tmp[0] == tmp[3]){
            answer = 1111*tmp[0];
        } else if(tmp[0] == tmp[2]){
            answer = (int)Math.pow(tmp[0]*10+tmp[3],2);
        } else if(tmp[1] == tmp[3]){
            answer = (int)Math.pow(tmp[3]*10+tmp[0],2);
        } else if(tmp[0] == tmp[1] && tmp[2]==tmp[3]){
            answer = (tmp[0]+tmp[3])*(tmp[3]-tmp[0]);
        } else if(tmp[0] == tmp[1]){
            answer = tmp[2]*tmp[3];
        } else if(tmp[1] == tmp[2]){
            answer = tmp[0]*tmp[3];
        } else if(tmp[2] == tmp[3]){
            answer = tmp[0]*tmp[1];
        } else{
            answer = tmp[0];
        }
        return answer;
    }
}