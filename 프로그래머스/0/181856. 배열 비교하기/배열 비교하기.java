class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = arr1.length>arr2.length ? 1 : -1;
        if(arr1.length==arr2.length){
            int tmp1 = 0;
            int tmp2 = 0;
            for(int i : arr1){
                tmp1 += i;
            }
            for(int i : arr2){
                tmp2 += i;
            }
            if(tmp2==tmp1){
                return 0;
            } else if(tmp2>tmp1){
                return -1;
            } else{
                return 1;
            }
        }
        return answer;
    }
}