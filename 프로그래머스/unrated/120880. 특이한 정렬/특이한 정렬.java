class Solution {
    public int[] solution(int[] numlist, int n) {
        int num = numlist.length;
        for(int i = 0; i< num; i++){
            for(int j = i; j< num; j++){
                if(Math.abs(numlist[i]-n)>Math.abs(numlist[j]-n)){
                    int tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                } else if(Math.abs(numlist[i]-n)==Math.abs(numlist[j]-n) && numlist[i]<numlist[j]){
                    int tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
            }
        }
        return numlist;
    }
}