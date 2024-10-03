import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> top1 = new HashMap<>();
        HashMap<Integer, Integer> top2 = new HashMap<>();
        for(int i : topping){
            top1.put(i, top1.getOrDefault(i, 0)+1);
        }
        for(int i = 0; i < topping.length; i++){
            if(top1.containsKey(topping[i]) && top1.get(topping[i])>1){
                top1.put(topping[i], top1.get(topping[i])-1);
                top2.put(topping[i], top2.getOrDefault(topping[i], 0)+1);
            } else if(top1.get(topping[i])==1){
                top1.remove(topping[i]);
                top2.put(topping[i], top2.getOrDefault(topping[i], 0)+1);
            }
            
            if(top1.size()==top2.size()){
                answer++;
            }
        }
        return answer;
    }
}