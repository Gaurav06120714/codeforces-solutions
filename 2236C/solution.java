import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            long[] sa = seq(a, x);
            long[] sb = seq(b, x);

            long best = Long.MAX_VALUE;
            for (long v : sa) best = Math.min(best, cost(sa, v) + cost(sb, v));
            for (long v : sb) best = Math.min(best, cost(sa, v) + cost(sb, v));

            out.append(best).append('\n');
        }
        System.out.print(out);
    }

    static long[] seq(long n, long x) {
        ArrayList<Long> list = new ArrayList<>();
        list.add(n);
        while (n > 0) { n = n / x; list.add(n); }
        long[] arr = new long[list.size()];
        for (int i = 0; i < arr.length; i++) arr[i] = list.get(i);
        return arr;
    }

    static long cost(long[] chain, long v) {
        long best = Long.MAX_VALUE;
        for (int d = 0; d < chain.length; d++)
            if (chain[d] <= v) best = Math.min(best, d + (v - chain[d]));
        return best;
    }
}