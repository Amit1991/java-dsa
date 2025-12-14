package misc.recursion;

public class Factorial {

    public static int factorial(int n){

        if(n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }

    public static int factorialIterative(int n){

        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialOptimizedIterative(int n){

        if(n == 0 || n == 1) return 1;

        int result = 1;
        for(int i = n; i > 1; i--) {

            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialIterative(5));
        System.out.println(factorialOptimizedIterative(5));
    }
}
