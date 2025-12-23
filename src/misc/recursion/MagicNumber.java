package misc.recursion;

public class MagicNumber {

    /**
     * Recursively determines if number is magic number
     * TC: O(log10n)
     * SC: O(log10n)
     */
    public static boolean isMagicNumber(int n, int currSum) {

        if(n == 0) {
            if(currSum < 10) return currSum == 1;
            return isMagicNumber(currSum, 0);
        }
        return isMagicNumber(n/10, currSum + (n%10));
    }

    public static void main(String[] args) {

        System.out.println(isMagicNumber(12340, 0));
        System.out.println(isMagicNumber(12345, 0));
    }
}
