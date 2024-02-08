import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int limit = nums.length/2;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                answer++;
                list.add(nums[i]);
            }
            if(list.size()==limit){
                break;
            }
        }
        return answer;
    }
}