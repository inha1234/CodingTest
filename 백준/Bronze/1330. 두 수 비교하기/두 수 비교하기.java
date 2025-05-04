import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] tmp = text.split(" ");
        int A = Integer.parseInt(tmp[0]);
        int B = Integer.parseInt(tmp[1]);

        if(A>B){
            System.out.println(">");
        } else if (A<B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}