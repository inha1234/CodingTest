class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int tmp = 0;
        for(boolean i : finished){
            if(!i){
                tmp++;
            }
        }
        String[] answer = new String[tmp];
        for(int i  = 0; i < todo_list.length; i++){
            if(!finished[i]){
                answer[tmp-answer.length] =  todo_list[i];
                tmp++;
            }
        }
        return answer;
    }
}