class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int tmp1 = 0;
        int tmp2 = 1;
        for(int i = 0; i < num_list.length; i++){
            tmp1 += num_list[i];
            tmp2 *= num_list[i];
        }
        if(tmp2<tmp1*tmp1){
            answer = 1;
        }
        return answer;
    }
}