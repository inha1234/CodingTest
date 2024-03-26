import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[][] frGifts = new int[friends.length][friends.length];
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> records = new HashMap<>();
        HashMap<Integer, String> revRecords = new HashMap<>();
        HashMap<String, Integer> name = new HashMap<>();
        for(int i = 0; i < friends.length; i++){
            records.put(friends[i], i);
            revRecords.put(i, friends[i]);
            name.put(friends[i], 0);
        }
        for(String i : friends){
            map.put(i,0);
        }
        for(String i : gifts){
            String[] str = i.split(" ");
            frGifts[records.get(str[0])][records.get(str[1])]++;
            map.put(str[0], map.get(str[0])+1);
            map.put(str[1], map.get(str[1])-1);
        }
        for(int i = 0; i<frGifts.length; i++){
            for(int j = 0; j<frGifts.length; j++){
                if(i==j){
                    continue;
                }
                if(frGifts[i][j]==frGifts[j][i]){
                    if(map.get(revRecords.get(i))>map.get(revRecords.get(j))){
                        name.put(revRecords.get(i), name.get(revRecords.get(i))+1);
                    } else if(map.get(revRecords.get(i))<map.get(revRecords.get(j))){
                        name.put(revRecords.get(j), name.get(revRecords.get(j))+1);
                    }
                } else if(frGifts[i][j]>frGifts[j][i]){
                    name.put(revRecords.get(i), name.get(revRecords.get(i))+1);
                } else if(frGifts[i][j]<frGifts[j][i]){
                    name.put(revRecords.get(j), name.get(revRecords.get(j))+1);
                }
            }
        }
        for(String str : name.keySet()){
            answer = Math.max(answer, name.get(str)/2);
        }
        return answer;
    }
}