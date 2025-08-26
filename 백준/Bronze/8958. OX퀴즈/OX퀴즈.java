import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String s = br.readLine().trim();
            int streak = 0;
            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'O') {
                    streak++;
                    sum += streak;
                } else { // 'X'
                    streak = 0;
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.print(sb.toString());
    }
}
