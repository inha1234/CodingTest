import java.util.List;
import java.util.LinkedList;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
        for(int i = 0; i < str1.length()-1; i++){
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i+1);
            if(Character.isLetter(c1) && Character.isLetter(c2)){
                String tmp = "" + c1 + c2;
                list1.add(tmp.toLowerCase());
            }
        }
        
        for(int i = 0; i < str2.length()-1; i++){
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i+1);
            if(Character.isLetter(c1) && Character.isLetter(c2)){
                String tmp = "" + c1 + c2;
                list2.add(tmp.toLowerCase());
            }
        }
        
        int inter = 0;
        for(String str : list1){
            if(list2.contains(str)){
                inter++;
                list2.remove(str);
            }
        }
        int union = list1.size() + list2.size();
        
        if(union==0){
            return 65536;
        }
        
        answer = (int) ((double)inter / union * 65536);
        return answer;
    }
}