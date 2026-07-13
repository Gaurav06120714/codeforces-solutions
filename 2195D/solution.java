import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String tStr = sc.next();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] f = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                f[i] = sc.nextLong();
            }

            long[] a = new long[n + 1];

            for (int i = 2; i <= n - 1; i++) {
                a[i] = (f[i + 1] - 2 * f[i] + f[i - 1]) / 2;
            }

            long sumForAn = 0;
            for (int i = 2; i <= n - 1; i++) {
                sumForAn += (long)(i - 1) * a[i];
            }
            a[n] = (f[1] - sumForAn) / (n - 1);

            long sumForA1 = 0;
            for (int i = 2; i <= n - 1; i++) {
                sumForA1 += (long)(n - i) * a[i];
            }
            a[1] = (f[n] - sumForA1) / (n - 1);

            for (int i = 1; i <= n; i++) {
                out.append(a[i]).append(i == n ? "" : " ");
            }
            out.append("\n");
        }
        System.out.print(out);
    }
}