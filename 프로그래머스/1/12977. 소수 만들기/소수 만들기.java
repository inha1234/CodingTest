class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                kFor:
                for(int k = j+1; k < nums.length; k++){
                    for(int m = 2; m <=(nums[i]+nums[j]+nums[k])/2; m++){
                        if((nums[i]+nums[j]+nums[k])%m==0){
                            continue kFor;
                        }
                    }
                    answer++;
                }
            }
        }

        return answer;
    }
}