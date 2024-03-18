import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        HashMap<String, Integer> type = new HashMap<String, Integer>();
        type.put("code", 0);
        type.put("date", 1);
        type.put("maximum", 2);
        type.put("remain", 3);
        
        List<int[]> list = new ArrayList<>();
        for(int[] i : data){
            if(i[type.get(ext)]< val_ext){
                list.add(i);
            }
        }
        list.sort(Comparator.comparingInt(arr->arr[type.get(sort_by)]));
        return list.toArray(new int[0][]);
    }
}