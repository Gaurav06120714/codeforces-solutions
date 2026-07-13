import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int operations = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x >= max) {
                    max = x;
                    operations++;
                }
            }

            System.out.println(operations);
        }
    }
}