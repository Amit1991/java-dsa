package misc.mathematics;

public class MathUtil {

    /**
     * Determines whether input is prime by trial division.
     * TC: O(sqrt(n))
     * SC: O(1)
     */
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(10));
        System.out.println(isPrime(11));
    }
}
