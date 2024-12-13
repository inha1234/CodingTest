class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = compress(arr, 0, 0, arr.length);
        return answer;
    }
    
    private int[] compress(int[][] arr, int x, int y, int size){
        if(isUniform(arr, x, y, size)){
            if(arr[x][y]==0){
                return new int[]{1, 0};
            } else{
                return new int[]{0, 1};
            }
        }
        int half = size/2;
        
        int[] topLeft = compress(arr, x, y, half);
        int[] topRight = compress(arr, x, y + half, half);
        int[] bottomLeft = compress(arr, x + half, y, half);
        int[] bottomRight = compress(arr, x + half, y + half, half);
        
        return new int[]{
            topLeft[0] + topRight[0] + bottomLeft[0] + bottomRight[0],
            topLeft[1] + topRight[1] + bottomLeft[1] + bottomRight[1]
        };
        
    }
    
    private boolean isUniform(int[][] arr, int x, int y, int size){
        int value = arr[x][y];
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(arr[i][j]!=value){
                    return false;
                }
            }
        }
        return true;
    }
}