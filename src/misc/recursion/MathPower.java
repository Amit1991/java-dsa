package misc.recursion;

public class MathPower {

    /**
     * Computes power via simple recursive multiplication.
     * TC: O(n)
     * SC: O(n)
     */
    public static long powerSimpleRecursive(int x, int n) {

        if(n == 0) return 1;
        if(n == 1) return x;
        return x * powerSimpleRecursive(x, n-1);
    }


    public static long powerIterative(int x, int n) {

        long result = 1;
        while(n > 0) {

            result *= x;
            n--;
        }

        return result;
    }

    /**
     * Recursively computes power using squaring for efficiency.
     * TC: O(logn)
     * SC: O(logn)
     */
    public static long fastPower(int x, int n) {

        if(n == 0) return 1;
        if(n == 1) return x;
        if(n % 2 == 0) return fastPower(x*x, n/2);
        return x * fastPower(x*x, n/2);
    }

    public static void main(String[] args) {

        System.out.println(powerSimpleRecursive(2, 20));
        System.out.println(powerIterative(2, 20));
        System.out.println(fastPower(2, 20));
    }
}
