class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] pNum = {
            {3,1}, //0
            {0,0}, //1
            {0,1}, //2
            {0,2}, //3
            {1,0}, //4
            {1,1}, //5
            {1,2}, //6
            {2,0}, //7
            {2,1}, //8
            {2,2} //9
        };
        int[] lNum = {3,0};
        int[] rNum = {3,2};
        for(int i : numbers){
            if(i==1 || i==4 || i==7){
                answer += "L";
                lNum = pNum[i];
            } else if(i==3 || i==6 || i==9){
                answer += "R";
                rNum = pNum[i];
            } else{
                if(Math.abs(lNum[0]-pNum[i][0])+Math.abs(lNum[1]-pNum[i][1]) > 
                   Math.abs(rNum[0]-pNum[i][0])+Math.abs(rNum[1]-pNum[i][1])){
                    answer += "R";
                    rNum = pNum[i];
                } else if(Math.abs(lNum[0]-pNum[i][0])+Math.abs(lNum[1]-pNum[i][1]) < 
                   Math.abs(rNum[0]-pNum[i][0])+Math.abs(rNum[1]-pNum[i][1])){
                    answer += "L";
                    lNum = pNum[i];
                } else{
                    if(hand.equals("left")){
                        answer += "L";
                        lNum = pNum[i];
                    } else{
                        answer += "R";
                        rNum = pNum[i];
                    }
                }
            }
        }
        return answer;
    }
}