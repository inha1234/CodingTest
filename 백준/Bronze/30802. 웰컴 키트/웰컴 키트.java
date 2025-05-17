import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        String sizeCount = scanner.nextLine();
        String TP = scanner.nextLine();

        String[] size = sizeCount.split(" ");
        String[] bundles = TP.split(" ");

        int sizeCountResult = 0;
        for(int i = 0; i < size.length; i++){
            long count = Long.parseLong(size[i]);
            sizeCountResult += count/Long.parseLong(bundles[0]);
            if(count%Integer.parseInt(bundles[0])!=0){
                sizeCountResult++;
            }
        }
        System.out.println(sizeCountResult);
        System.out.println(Long.parseLong(N)/Long.parseLong(bundles[1]) + " " + Long.parseLong(N)%Long.parseLong(bundles[1]));
        scanner.close();
    }
}