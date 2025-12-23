package misc.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class TowerOfHanoi {

    static int row;

    /**
     * Populates an array with steps to solve Tower of Hanoi, using recursion.
     * TC: O(2^n)
     * SC: O(n)
     */
    public static void buildTowerOfHanoi(int n, int from, int to, int aux, int[][] result) {

        if (n == 0) return;
        buildTowerOfHanoi(n-1, from, aux, to, result);
        result[row++] = new int[]{n, from, to};
        buildTowerOfHanoi(n-1, aux, to, from, result);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = scanner.nextInt();
        int moves = 1 << n;

        int[][] result = new int[moves - 1][3];
        row = 0;
        buildTowerOfHanoi(n, 1, 3, 2, result);

        System.out.println(Arrays.deepToString(result));
    }
}
