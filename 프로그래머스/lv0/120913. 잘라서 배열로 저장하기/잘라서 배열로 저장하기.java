class Solution {
    public String[] solution(String my_str, int n) {
        int my_str_size = my_str.length();
        int size = my_str_size%n==0 ? my_str_size/n:(my_str_size/n)+1;
        int current = 0;
        String[] answer = new String[size];
        for(int i = 0; i<size; i++){
            answer[i] = "";
        }
        for(int i = 0; i<my_str_size; i++){
            current = i/n;
            answer[current] += my_str.charAt(i);
        }
        return answer;
    }
}