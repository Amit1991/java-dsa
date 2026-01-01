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

    public static void main(String[] args) {

        System.out.println( fastPowerWithMod(2, 10, 13));
    }
}
