class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] current = new int[2];
        for(int i = 0; i<park.length; i++){
            for(int j = 0; j<park[i].length(); j++){
                if(park[i].charAt(j)=='S'){
                    current[0] = i;
                    current[1] = j;
                    break;
                }
            }
        }
        System.out.println(current[0] + " " + current[1]);
        moveCase:
        for(int i = 0; i<routes.length; i++){
            String[] route = routes[i].split(" ");
            int move = Integer.parseInt(route[1]);
            if(route[0].equals("N")&&
               current[0]-move>=0){
                for(int j = 0; j<move; j++){
                    if(park[current[0]-1-j].charAt(current[1])=='X'){
                        continue moveCase;
                    }
                }
                current[0] -= move;
                
            } else if(route[0].equals("S")&&
                     current[0]+move<park.length){
                for(int j = 0; j<move; j++){
                    if(park[current[0]+1+j].charAt(current[1])=='X'){
                        continue moveCase;
                    }
                }
                current[0] += move;
                
            } else if(route[0].equals("W")&&
                     current[1]-move>=0){
                for(int j = 0; j<move; j++){
                    if(park[current[0]].charAt(current[1]-1-j)=='X'){
                        continue moveCase;
                    }
                }
                current[1] -= move;
                
            } else if(route[0].equals("E")&&
                     current[1]+move<park[current[0]].length()){
                for(int j =0; j<move; j++){
                    if(park[current[0]].charAt(current[1]+1+j)=='X'){
                        continue moveCase;
                    }
                }
                current[1] += move;
            }
        }
        return current;
    }
}