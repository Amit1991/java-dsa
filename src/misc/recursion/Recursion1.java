package misc.recursion;

public class Recursion1 {

    public static int func(int x, int n) {

        if (n == 0) {
            System.out.println("1- x: " + x + " n: " + n + "");
            return 1;
        }
        else if(n % 2 == 0) {
            System.out.println("2- x: " + x + " n: " + n + "");
            return func(x * x, n / 2);
        } else {
            System.out.println("3- x: " + x + " n: " + n + "");
            return x * func(x * x, (n - 1) / 2);
        }
    }

    public static void solve(int A) {

        if(A > 0) {
            solve(A-1);
            System.out.print(A + " ");
        }
        else {

            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        System.out.println(func(2, 10));
        solve(10);
    }
}
