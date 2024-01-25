class Solution {
    boolean solution(String s) {
        boolean answer = false;
        String str = s.toLowerCase();
        int pIdx = 0;
        int yIdx = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='y'){
                yIdx++;
            } if(str.charAt(i)=='p'){
                pIdx++;
            }
        }
        if(pIdx==yIdx){
            return true;
        }
        return answer;
    }
}