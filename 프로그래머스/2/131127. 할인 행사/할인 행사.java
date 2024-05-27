import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<10; i++){
            map.put(discount[i], map.getOrDefault(discount[i], 0)+1);
        }
        for(int i = 0; i<=discount.length-10; i++){
            if(i>0){
                map.put(discount[i+9], map.getOrDefault(discount[i+9], 0)+1);
                map.put(discount[i-1], map.getOrDefault(discount[i-1],0)-1);
            }
            boolean isValid = true;
            for(int j = 0; j<want.length; j++){
                if(map.getOrDefault(want[j],0)<number[j]){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                answer++;
            }
            
        }
        return answer;
    }
}