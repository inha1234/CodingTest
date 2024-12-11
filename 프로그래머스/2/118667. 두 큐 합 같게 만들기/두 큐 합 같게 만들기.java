import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();
        long total1 = 0;
        long total2 = 0;
        int tmp = 0;
        int max = queue1.length + queue2.length;
        
        for(int i = 0; i < queue1.length; i++){
            que1.add(queue1[i]);
            total1 += queue1[i];
        }
        for(int i = 0; i < queue2.length; i++){
            que2.add(queue2[i]);
            total2 += queue2[i];
        }
        
        while(tmp<max*2){
            if(total1==total2){
                return tmp;
            } else if(total1<total2){
                tmp++;
                total2 -= que2.peek();
                total1 += que2.peek();
                que1.add(que2.poll());
            } else if(total1>total2){
                tmp++;
                total1 -= que1.peek();
                total2 += que1.peek();
                que2.add(que1.poll());
            }
        }
        return answer;
    }
}