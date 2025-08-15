class Solution {
    public int solution(int storey) {
        int answer = 0;
        int floor = storey;
        while(floor>0){
            if(floor%10<5){
                answer += floor%10;
                floor /= 10;
            } else if(floor%10>5){
                answer += 10-floor%10;
                floor /= 10;
                floor += 1;
            } else if(floor%10==5){
                if(floor/10%10<5){
                    answer += floor%10;
                    floor /= 10;
                } else if(floor/10%10>=5){
                    answer += floor%10;
                    floor /= 10;
                    floor += 1;
                }
            }
        }
        return answer;
    }
}