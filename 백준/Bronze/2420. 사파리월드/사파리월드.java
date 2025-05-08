import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split(" ");
        long a = Integer.parseInt(split[0]);
        long b = Integer.parseInt(split[1]);
        System.out.println(Math.abs(a-b));
    }
}