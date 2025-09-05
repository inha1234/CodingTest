import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();


        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextLine().trim());
        }


        List<String> words = new ArrayList<>(set);


        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return a.length() - b.length();
                }
                return a.compareTo(b);
            }
        });


        for (String w : words) {
            System.out.println(w);
        }

        sc.close();
    }
}
