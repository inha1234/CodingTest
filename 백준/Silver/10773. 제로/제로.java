import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        long sum = 0;

        for (int i = 0; i < K; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                int removed = stack.pop();
                sum -= removed;
            } else {
                stack.push(x);
                sum += x;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
