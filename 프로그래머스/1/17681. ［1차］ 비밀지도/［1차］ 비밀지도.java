class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];
        for(int i = 0; i < n; i++){
            strArr1[i] = Integer.toString(arr1[i],2);
            strArr2[i] = Integer.toString(arr2[i],2);
            while(strArr1[i].length()<n){
                strArr1[i] = "0" + strArr1[i];
            }
            while(strArr2[i].length()<n){
                strArr2[i] = "0" + strArr2[i];
            }
        }
        for(int i = 0; i < n; i++){
            answer[i] = "";
            for(int j = 0; j < n; j++){
                if(strArr1[i].charAt(j)=='1' || strArr2[i].charAt(j)=='1'){
                    answer[i] += "#";
                } else{
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }
}