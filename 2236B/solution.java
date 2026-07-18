import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            String s = br.readLine();

            boolean possible = true;

            for (int start = 0; start < k; start++) {
                int ones = 0;

                for (int j = start; j < n; j += k) {
                    if (s.charAt(j) == '1') {
                        ones++;
                    }
                }

                if ((ones & 1) == 1) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}