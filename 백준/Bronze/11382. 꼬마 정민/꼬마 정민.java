import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String[] tmp = A.split(" ");
        long answer = 0;
        for(String str : tmp){
            answer += Long.parseLong(str);
        }

        System.out.println(answer);
    }
}