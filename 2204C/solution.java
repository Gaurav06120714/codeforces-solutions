import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long m = sc.nextLong();
            
            long aliceVisits = m / a;
            long bobVisits = m / b;
            long carolVisits = m / c;
            
            long lcm_ab = lcm(a, b);
            long lcm_ac = lcm(a, c);
            long lcm_bc = lcm(b, c);
            long lcm_abc = lcm(lcm_ab, c);
            
            long aliceBob = m / lcm_ab;
            long aliceCarol = m / lcm_ac;
            long bobCarol = m / lcm_bc;
            long allThree = m / lcm_abc;
            
            long aliceSolo = aliceVisits - aliceBob - aliceCarol + allThree;
            long aliceWithBobOnly = aliceBob - allThree;
            long aliceWithCarolOnly = aliceCarol - allThree;
            
            long bobSolo = bobVisits - aliceBob - bobCarol + allThree;
            long bobWithAliceOnly = aliceBob - allThree;
            long bobWithCarolOnly = bobCarol - allThree;
            
            long carolSolo = carolVisits - aliceCarol - bobCarol + allThree;
            long carolWithAliceOnly = aliceCarol - allThree;
            long carolWithBobOnly = bobCarol - allThree;
            
            long aliceWater = aliceSolo * 6 + aliceWithBobOnly * 3 + aliceWithCarolOnly * 3 + allThree * 2;
            long bobWater = bobSolo * 6 + bobWithAliceOnly * 3 + bobWithCarolOnly * 3 + allThree * 2;
            long carolWater = carolSolo * 6 + carolWithAliceOnly * 3 + carolWithBobOnly * 3 + allThree * 2;
            
            System.out.println(aliceWater + " " + bobWater + " " + carolWater);
        }
        
        sc.close();
    }
    
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}