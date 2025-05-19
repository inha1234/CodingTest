import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        String num = scanner.nextLine();
        String[] numSplit = num.split(" ");
        int result = 0;
        int intN = Integer.parseInt(N);
        f1:
        for(int i = 0; i < intN; i++){
            int tmp = Integer.parseInt(numSplit[i]);
            if(tmp<2){
                continue;
            }
            for(int j = 2; j <= Math.sqrt(tmp); j++){
                if(tmp%j==0){
                    continue f1;
                }
            }
            result++;
        }
        System.out.println(result);
        scanner.close();
    }
}