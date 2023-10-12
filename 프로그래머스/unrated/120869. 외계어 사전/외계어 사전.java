class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        one:
        for(int i = 0; i<dic.length; i++){
            if(dic[i].length() < spell.length){
                continue;
            } else{
                for(int j = 0; j<spell.length; j++){
                    if(dic[i].contains(spell[j])){
                        if(j==spell.length-1){
                            answer = 1;
                            break one;
                        }
                    } else{
                        break;
                    }
                }
            }
        }
        return answer;
    }
}