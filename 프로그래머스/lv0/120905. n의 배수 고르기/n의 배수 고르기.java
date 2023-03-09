import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : numlist){
            if(num%n==0) list.add(num);
        }
        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list) answer[cnt++] = num;
        return answer;
    }
}