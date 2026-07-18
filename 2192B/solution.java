import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            
            int c1 = 0;
            for (char c : s.toCharArray()) if (c == '1') c1++;
            int c0 = n - c1;
            
            if (c1 % 2 == 0) {
                // choose all positions with '1'
                List<Integer> ops = new ArrayList<>();
                for (int i = 0; i < n; i++) if (s.charAt(i) == '1') ops.add(i + 1);
                sb.append(ops.size()).append('\n');
                for (int i = 0; i < ops.size(); i++) {
                    if (i > 0) sb.append(' ');
                    sb.append(ops.get(i));
                }
                sb.append('\n');
            } else if (c0 % 2 == 1) {
                // choose all positions with '0'
                List<Integer> ops = new ArrayList<>();
                for (int i = 0; i < n; i++) if (s.charAt(i) == '0') ops.add(i + 1);
                sb.append(ops.size()).append('\n');
                for (int i = 0; i < ops.size(); i++) {
                    if (i > 0) sb.append(' ');
                    sb.append(ops.get(i));
                }
                sb.append('\n');
            } else {
                sb.append(-1).append('\n');
            }
        }
        
        System.out.print(sb);
    }
}