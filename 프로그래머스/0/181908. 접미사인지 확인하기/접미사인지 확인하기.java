class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.contains(is_suffix)){
            int idx = 0;
            for(int i = my_string.length()-is_suffix.length(); i < my_string.length(); i++){
                if(my_string.charAt(i)!=is_suffix.charAt(idx++)){
                    return 0;
                }
            }
            return 1;
        }
        return answer;
    }
}