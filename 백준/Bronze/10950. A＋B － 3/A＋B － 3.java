import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testNum = scanner.nextLine();
        
        for(int i = 0; i < Integer.parseInt(testNum); i++){
            String str = scanner.nextLine();
            String[] split = str.split(" ");
            int result = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
            System.out.println(result);
        }
    }
}