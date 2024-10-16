import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> inCar = new HashSet<>();
        for(int i = 0; i < records.length; i++){
            String[] tmp = records[i].split(" ");
            String[] time = tmp[0].split(":");
            int minutes = Integer.parseInt(time[0])*60+Integer.parseInt(time[1]);
            int carNum = Integer.parseInt(tmp[1]);
            if(tmp[2].equals("IN")){
                map.put(carNum, map.getOrDefault(carNum,0) + (minutes*-1));
                inCar.add(carNum);
                set.add(carNum);
            } else if(map.containsKey(carNum)&&tmp[2].equals("OUT")){
                map.put(carNum, map.get(carNum)+minutes);
                inCar.remove(carNum);
            }
        }
        if(!set.isEmpty()){
            for(int i : inCar){
                map.put(i, map.get(i)+1439);
            }
        }
        int[] answer = new int[set.size()];
        int idx = 0;
        for(int i : set){
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        for(int i = 0; i < answer.length; i++){
            if(map.get(answer[i])<fees[0]){
                answer[i] = fees[1];
            } else{
                if((map.get(answer[i])-fees[0])%fees[2]==0){
                    answer[i] = fees[1] + ((map.get(answer[i])-fees[0])/fees[2])*fees[3];
                } else{
                    answer[i] = fees[1] + ((map.get(answer[i])-fees[0])/fees[2])*fees[3]+fees[3];
                }
            }
        }
        return answer;
    }
}