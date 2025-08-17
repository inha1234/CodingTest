import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        HashMap<Long, Long> map = new HashMap<>();
        for(int i : weights){
            map.put((long)i, map.getOrDefault((long)i, 0L) +1L);
        }
        
        for(long i : map.keySet()){
            long num = map.get(i);
            if(num > 1){
                answer += num*(num-1)/2;
            }
        }
        
        long[][] ratios = {
            {2,3}, {3,2}, {1,2},
            {2,1}, {3,4}, {4,3}
        };
        
        for(long i : map.keySet()){
            for(long[] ratio : ratios){
                long tmp1 = i*ratio[0];
                long tmp2 = ratio[1];
                
                if(tmp1%tmp2 !=0){
                    continue;
                }
                
                long target = tmp1/tmp2;
                
                if(target > i && map.containsKey(target)){
                    answer += map.get(i)*map.get(target);
                }
            }
        }
        
        return answer;
    }
}