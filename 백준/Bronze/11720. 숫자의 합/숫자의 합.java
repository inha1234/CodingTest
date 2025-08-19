import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 숫자의 개수
        String numbers = sc.next(); // 공백 없이 붙어 있는 숫자 문자열

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += numbers.charAt(i) - '0'; 
            // char를 숫자로 변환 ('0' = 48 아스키 코드, 따라서 '5' - '0' = 5)
        }

        System.out.println(sum);
    }
}