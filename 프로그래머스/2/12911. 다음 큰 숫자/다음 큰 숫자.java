class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmpN = n;
        String tmp = Integer.toBinaryString(tmpN++);
        int oneNum = int2(tmp);
        int intTmp = 0;
        while(true){
            tmp = Integer.toBinaryString(tmpN);
            intTmp = int2(tmp);
            if(intTmp==oneNum){
                answer = tmpN;
                break;
            }
            tmpN++;
        }
        return answer;
    }
    
    public int int2(String n){
        int tmp = 0;
        for(int i = 0; i<n.length(); i++){
            if(n.charAt(i)=='1'){
                tmp++;
            }
        }
        return tmp;
    }
}