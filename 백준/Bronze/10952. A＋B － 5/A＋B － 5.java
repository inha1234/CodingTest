import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String str = scanner.nextLine();
            String[] split = str.split(" ");
            if(Integer.parseInt(split[0])==0 && Integer.parseInt(split[1])==0){
                break;
            }
            int result = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
            System.out.println(result);
        }
    }
}