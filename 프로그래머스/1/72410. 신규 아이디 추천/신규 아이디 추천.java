class Solution {
    public String solution(String new_id) {
        String answer = "";
        String tmp = "";
        for(int i = 0; i < new_id.length(); i++){
            char tmpC = new_id.charAt(i);
            if(tmpC == '.'){
                if(tmp.length()>0){
                    if(tmp.charAt(tmp.length()-1)!='.'){
                        tmp += tmpC;
                    }
                }
            } else if(tmpC == '-' || tmpC == '_' || 
               (tmpC>=65 && tmpC<=90) || (tmpC>=97 && tmpC<=122) || (tmpC>=48 && tmpC<=57)){
                tmp += tmpC;
            }
        }
        int len = tmp.length()<=15 ? tmp.length() : 15;
        for(int i = 0; i<len; i++){
            char tmpC2 = tmp.charAt(i);
            if(tmpC2>=65 && tmpC2<=90){
                answer += Character.toLowerCase(tmpC2);
            } else if(tmpC2>=97 && tmpC2<=122){
                answer += tmpC2;
            }else if(tmpC2=='.'){
                if(i==len-1){
                    continue;
                }
                if(answer.length()==0 || i==len-1){
                    if(tmp.length()>len+1){
                        len++;
                    }
                } else if(tmp.charAt(i+1)=='.'){
                    i++;
                    answer += tmpC2;
                } else{
                    answer += tmpC2;
                }
            } else{
                answer += tmpC2;
            }
        }
        if(answer.length()==0){
            return "aaa";
        } else if(answer.length()<3){
            while(answer.length()<3){
                answer += answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }
}