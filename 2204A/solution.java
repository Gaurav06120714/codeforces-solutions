import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            Set<Integer> visited = new HashSet<>();
            
            int currentPos = 0;
            visited.add(currentPos);
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(currentPos) == 'R') {
                    currentPos++;
                } else {
                    currentPos--;
                }
                visited.add(currentPos);
            }
            
            System.out.println(visited.size());
        }
        
        sc.close();
    }
}