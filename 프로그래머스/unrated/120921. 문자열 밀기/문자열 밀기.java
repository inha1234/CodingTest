class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)){
            return 0;
        }
        String copy = A;
        int cnt = 0;
        int cnt2 = 0;
        // for(int i = 0; i < A.length(); i++){
        //     String tmp = A.substring(0,1);
        //     A = A.substring(1,A.length());
        //     A += tmp;
        //     if(A.equals(B)){
        //         cnt = i+1;
        //         break;
        //     }
        // }
        A = copy;
        for(int i = 0; i < A.length(); i++){
            String tmp = A.substring(0,A.length()-1);
            A = A.substring(A.length()-1,A.length());
            A += tmp;
            if(A.equals(B)){
                cnt2 = i+1;
                return cnt2;
                // break;
            }
        }
        // if(cnt != 0 || cnt2 != 0){
        //     return Math.min(cnt, cnt2);
        // }
        return -1;
    }
}