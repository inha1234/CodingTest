class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[] lNum = {3,0};
        int[] rNum = {3,2};
        int tmp = -1;
        int rTmp = -1;
        int lTmp = -1;
        for(int i : numbers){
           if(i==1 || i==4 || i==7){
               lNum[0] = (i-1)/3;
               lNum[1] = 0;
               answer.append("L");
           } else if(i==3 || i==6 || i==9){
               rNum[0] = (i-1)/3;
               rNum[1] = 2;
               answer.append("R");
           } else{
               if(i==0){
                   tmp = 3;
               } else{
                   tmp = i/3;
               }
               lTmp = Math.abs(tmp-lNum[0])+Math.abs(1-lNum[1]);
               rTmp = Math.abs(tmp-rNum[0])+Math.abs(1-rNum[1]);
               if(rTmp>lTmp){
                   answer.append("L");
                   lNum[0]=tmp;
                   lNum[1]=1;
               } else if(rTmp<lTmp){
                   answer.append("R");
                   rNum[0]=tmp;
                   rNum[1]=1;
               } else{
                   if(hand.equals("left")){
                       answer.append("L");
                       lNum[0]=tmp;
                       lNum[1]=1;
                   } else{
                       answer.append("R");
                       rNum[0]=tmp;
                       rNum[1]=1;
                   }
               }
           }
        }
        return answer.toString();
    }
}