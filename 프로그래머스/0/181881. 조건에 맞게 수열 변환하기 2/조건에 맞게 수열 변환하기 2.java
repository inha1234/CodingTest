class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean isCheck = false;
        while(!isCheck){
            isCheck = true;
            for(int i = 0; i < arr.length; i++){
                if(arr[i]>=50 && arr[i]%2 ==0){
                    arr[i] /= 2;
                    isCheck = false;
                } else if(arr[i]<50 && arr[i]%2 !=0){
                    arr[i] = arr[i]*2+1;
                    isCheck = false;
                }
            }
            if(!isCheck){
                answer++;
            }
        }
        return answer;
    }
}