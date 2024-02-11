import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {1,3,4,5};
        int[] p3 = {3,1,2,4,5};
        int[] cnt = new int[3];
        int max = 0;
        int idx = 0;
        for(int i = 0; i < answers.length; i++){
            if(p1[i%5]==answers[i]){
                cnt[0]++;
            }
            if((i+1)%2==0){
                if(p2[(i/2)%4]==answers[i]){
                    cnt[1]++;
                }
            } else if(2==answers[i]){
                cnt[1]++;
            }
            if(p3[i/2%5]==answers[i]){
                cnt[2]++;
            }
        }
        max = Math.max(cnt[0], Math.max(cnt[1],cnt[2]));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < cnt.length; i++){
            if(max==cnt[i]){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}