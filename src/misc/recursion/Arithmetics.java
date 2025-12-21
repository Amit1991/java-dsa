package misc.recursion;

public class Arithmetics {

    /**
     * Recursively prints ascending arithmetic progression to the console.
     */
    public static void apRecursiveAsc(int current, int finalValue) {

        if(current > finalValue) return;
        System.out.print(current + " ");
        apRecursiveAsc(current+1, finalValue);

        if(current == finalValue) {
            System.out.println();
        }
    }

    /**
     * Recursively prints descending arithmetic progression to the console
     */
    public static void apRecursiveDesc(int current, int finalValue) {

        if(current < finalValue) return;
        System.out.print(current + " ");
        apRecursiveDesc(current-1, finalValue);

        if(current == finalValue) {
            System.out.println();
        }
    }

    public static int sumOfDigitsRecursive(int n) {

        if(n == 0) return 0;
        return n % 10 + sumOfDigitsRecursive(n / 10);
    }

    /**
     * Prints decreasing sequence then increasing sequence
     */
    public static void decThenInc (int A) {

        if (A == 0) {
            return;
        }
        System.out.print(A + " ");
        decThenInc(A - 1);
        System.out.print(A + " ");
    }

    public static void main(String[] args) {

        apRecursiveAsc(1, 20);
        apRecursiveDesc(20, 1);
        System.out.println(sumOfDigitsRecursive(12345));

        decThenInc(10);
    }
}
