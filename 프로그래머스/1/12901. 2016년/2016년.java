import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate tmp = LocalDate.of(2016,a,b);
        DayOfWeek tmp2 = tmp.getDayOfWeek();
        switch(tmp2){
            case SUNDAY:
                answer = "SUN";
                break;
            case MONDAY:
                answer = "MON";
                break;
            case TUESDAY:
                answer = "TUE";
                break;
            case WEDNESDAY:
                answer = "WED";
                break;
            case THURSDAY:
                answer = "THU";
                break;
            case FRIDAY:
                answer = "FRI";
                break;
            case SATURDAY:
                answer = "SAT";
                break;
        }
        return answer;
    }
}