package misc.recursion;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    /**
     * Recursively computes nth Fibonacci number
     * TC: O(2^n)
     * SC: O(n)
     */
    public static int fibRecursive(int n) {

        if(n <= 1) {
            return n;
        } else {
            return fibRecursive(n-1) + fibRecursive(n-2);
        }
    }

    /**
     * Iteratively computes and returns Fibonacci sequence
     * TC: O(n)
     * SC: O(n)
     */
    public static List<Integer> fibIterative(int n) {
        List<Integer> result = new ArrayList<>();

        if (n >= 0) result.add(0);
        if (n >= 1) result.add(1);

        for(int i = 2; i <= n; i++) {

            result.add(result.get(i-1) + result.get(i-2));
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(fibRecursive(11));
        System.out.println(fibIterative(11));
    }
}
