import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}