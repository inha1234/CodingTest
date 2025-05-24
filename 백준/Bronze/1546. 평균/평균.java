import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String strScore = scanner.nextLine();
        int N = Integer.parseInt(n);
        String[] splitScore = strScore.split(" ");
        int max = 0;
        for(int i = 0; i < N; i++){
            max = Math.max(max, Integer.parseInt(splitScore[i]));
        }

        Double reslut = 0.0;

        for(int i = 0; i < N; i++){
            reslut += Double.parseDouble(splitScore[i])/max*100;
        }
        reslut /= N;
        System.out.printf("%.6f\n", reslut);
        scanner.close();
    }
}