import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = 0;
        for(int i = 1; i<=N; i++){
            int sum = i;
            int tmp = i;
            while(tmp>0){
                sum += tmp%10;
                tmp /= 10;
            }
            if(N==sum){
                result = i;
                break;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}