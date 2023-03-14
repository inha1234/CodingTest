import java.util.ArrayList;

class Solution {
    public int solution(String my_string) {
        String str = "";
        ArrayList<String> list = new ArrayList<>();
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='A' && my_string.charAt(i)<='z'){
                if(str.length()==0){
                    continue;
                } else{
                list.add(str);
                str = "";
                }  
            } else{
                if(str.length()==0 && my_string.charAt(i)=='0') continue;
                else str += ""+my_string.charAt(i);
            }
            
            if(i==my_string.length()-1 && str.length()!=0){
                list.add(str);
            }
        }
        for(String s:list){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}

// ArrayList를 만들고,
// string 변수하나 생성하고,
// 값이 A< && <z사이면 ArrayList에 add.
// 아니면 string+=

// 엣지 케이스를 뭔가 놓치고있다.
// 아 길이의 끝에 도달하는건 계산안했구나