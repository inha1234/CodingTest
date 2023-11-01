class Solution {
    public String solution(String polynomial) {
        String[] tmp = polynomial.split(" ");
        String answer = "";
        int num = 0;
        int xnum = 0;
        for(String temp : tmp){
            if(temp.contains("x")){
                String tmpNumber = temp.replace("x", "");
                if(tmpNumber.equals("")){
                    xnum += 1;
                } else{
                    xnum += Integer.parseInt(tmpNumber);
                }
            } else if(temp.contains("+")){
                continue;
            } else{
                num += Integer.parseInt(temp);
            }
        }
        if(num == 0 && xnum != 0){
            if(xnum==1){
                answer = "x";
            } else{
                answer = xnum + "x";
            }
        } else if(num != 0 && xnum == 0){
            answer += num;
        } else{
            if(xnum==1){
                answer = "x" + " + " + num;
            } else{
                answer = xnum + "x" + " + " + num;
            }
        }
        return answer;
    }
}