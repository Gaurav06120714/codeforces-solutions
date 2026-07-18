import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            if (n == 1) {
                System.out.println(0);
                continue;
            }
            
            int[][] dp = new int[n][7];
            
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= 6; j++) {
                    dp[i][j] = 1000000;
                }
            }
            
            for (int v = 1; v <= 6; v++) {
                dp[0][v] = (a[0] == v) ? 0 : 1;
            }
            
            for (int i = 1; i < n; i++) {
                for (int v = 1; v <= 6; v++) {
                    int cost = (a[i] == v) ? 0 : 1;
                    
                    for (int prev = 1; prev <= 6; prev++) {
                        if (isAdjacent(prev, v)) {
                            dp[i][v] = Math.min(dp[i][v], dp[i-1][prev] + cost);
                        }
                    }
                }
            }
            
            int ans = 1000000;
            for (int v = 1; v <= 6; v++) {
                ans = Math.min(ans, dp[n-1][v]);
            }
            
            System.out.println(ans);
        }
    }
    
    static boolean isAdjacent(int a, int b) {
        if (a == b) return false;
        if (a + b == 7) return false;
        return true;
    }
}