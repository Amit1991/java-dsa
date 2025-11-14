package bitManipulation;

public class NthMagicalNumber {

    public static int getNthMagicalNumber(int base, int n) {

        int result = 0;
        int curr = base;

        while(n > 0) {

            if((n & 1) == 1) result += curr;
            curr = curr * base;
            n >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(getNthMagicalNumber(5, 10));
        System.out.println(getNthMagicalNumber(3, 3));
    }
}
