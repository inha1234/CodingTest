import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        String[] splitN = n.split(" ");
        int M = Integer.parseInt(splitN[1]);
        int N = Integer.parseInt(splitN[0]);

        String stringNum = scanner.nextLine();

        String[] num = stringNum.split(" ");
        int result = 0;

        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j < N-1; j++){
                for(int k = j+1; k < N; k++){
                    int tmp = Integer.parseInt(num[i]) + Integer.parseInt(num[j]) + Integer.parseInt(num[k]);
                    if(tmp<=M && tmp > result){
                        result = tmp;
                    }
                }
            }
        }
        System.out.println(result);

        scanner.close();
    }
}