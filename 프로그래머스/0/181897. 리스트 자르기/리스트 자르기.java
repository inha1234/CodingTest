class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int num = 0;
        int cnt = 0;
        if(n==1){
            num = slicer[1]+1;
            answer = new int[num];
            for(int i = 0; i <= slicer[1]; i++){
                answer[cnt++] = num_list[i];
            }
        } else if(n==2){
            num = num_list.length-slicer[0];
            answer = new int[num];
            for(int i = slicer[0]; i < num_list.length; i++){
                answer[cnt++] = num_list[i];
            }
        } else if(n==3){
            num = slicer[1] - slicer[0] + 1;
            answer = new int[num];
            for(int i = slicer[0]; i <= slicer[1]; i++){
                answer[cnt++] = num_list[i];
            }
            
        } else if(n==4){
            num = (slicer[1] - slicer[0])/slicer[2]+1;
            answer = new int[num];
            for(int i = slicer[0]; i <= slicer[1]; i = i + slicer[2]){
                answer[cnt++] = num_list[i];
            }
        }
        return answer;
    }
}