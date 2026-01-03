package misc.recursion;

public class Mod {

    /**
     * Computes modular exponentiation via divide and conquer
     * TC: O(logn)
     * SC: O(logn)
     */
    public static int fastPowerWithMod(int base, int pow, int mod) {

        if(pow == 0) return 1;
        int half = fastPowerWithMod(base, pow/2, mod);
        if(pow % 2 == 0) {
            return (half * half) % mod;
        } else {
            return (base * half * half) % mod;
        }
    }

    /**
     * Computes the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
     * The GCD is the largest integer that divides both input integers without leaving a remainder.
     * TC: O(logn)
     * SC: O(1)
     */
    public static int gcd(int a, int b) {

        if (a == 0) return b;
        return gcd(b%a, a);
    }

    /**
     * Finds the largest coprime number between a and b in iterative way
     * TC: O(a * log(b))
     * SC: O(1)
     */
    public static int largestCoprime(int a, int b) {

        for(int i = a/2; i >= 1; i--) {

            if(a % i == 0) {

                if(gcd(i, b) == 1) return i;
            }
        }

        return 1;
    }

    /**
     * Finds the largest coprime number that is less than or equal to the given integer 'a'
     * such that it is coprime with the integer 'b'. The method uses an iterative approach
     * with the Euclidean algorithm for efficiency.
     * TC: O(log(a) * log(b))
     * SC: O(1)
     */
    public static int largestCoprimeFast(int a, int b) {

        int gcd = gcd(a, b);

        while(gcd != 1) {

            a = a / gcd;
            gcd = gcd(a, b);
        }

        return a;
    }

    /**
     * Computes the least common multiple (LCM) of two integers.
     * The LCM is the smallest positive integer that is divisible by both input integers.
     * This method uses the formula LCM(x, y) = (x * y) / GCD(x, y), where GCD is the greatest common divisor.
     */
    private static int lcm(int x, int y) {

        return (x * y) / gcd(x, y);
    }

    /**
     * Computes the result of a divisor game involving three integers.
     * The method calculates the integer division of A by the least common
     * multiple (LCM) of B and C. The LCM is computed using the helper method lcm.
     */
    private static int divisorGameResults(int A, int B, int C) {

        return A / lcm(B, C);
    }

    public static void main(String[] args) {

        System.out.println( fastPowerWithMod(2, 10, 13));
        System.out.println( gcd(10, 5));
        System.out.println( gcd(100, 150));
        System.out.println( largestCoprime(10, 15));
        System.out.println( largestCoprimeFast(10, 15));
        System.out.println( divisorGameResults(12, 3, 2));
    }
}
