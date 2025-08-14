import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A_str = sc.nextLine();
        String B_str = sc.nextLine();
        String C_str = sc.nextLine();

        int A = Integer.parseInt(A_str);
        int B = Integer.parseInt(B_str);
        int C = Integer.parseInt(C_str);

        int numResult = A + B - C;
        System.out.println(numResult);

        int strResult = Integer.parseInt(A_str + B_str) - Integer.parseInt(C_str);
        System.out.println(strResult);
    }
}