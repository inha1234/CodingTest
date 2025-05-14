import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String str = scanner.nextLine();
            String[] split = str.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int c = Integer.parseInt(split[2]);
            if(a==0 && b==0 && c==0){
                break;
            }
            int tmp = 0;
            if(a<b){
                tmp = b;
                b = a;
                a = tmp;
            }
            if(a<c){
                tmp = c;
                c = a;
                a = tmp;
            }
            if(a*a == b*b+c*c){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        scanner.close();
    }
}