package bitManipulation;

public class NumberOfOnes {

    // This has constant time complexity O(32) i.e. length of integer in bits
    // This is because it checks every bit one by one
    public static int countNumberOfOnes(int n) {
        int count = 0;
        while(n > 0) {
            count += (n & 1);
            n = n >> 1;
        }
        return count;
    }

    // Brian Kernighan’s Algorithm
    public static int countNumberOfOnesFaster(int n) {
        int count = 0;
        while(n > 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }

    // This is fastest
    public static int countNumberOfOnesInBuilt(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {

        System.out.println(countNumberOfOnes(14));
        System.out.println(countNumberOfOnesFaster(255));
        System.out.println(countNumberOfOnesInBuilt(14));
    }
}
