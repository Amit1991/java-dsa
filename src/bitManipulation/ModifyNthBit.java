package bitManipulation;

public class ModifyNthBit {

    public static int unsetNthBit(int n, int k) {

        return n & ~(1 << k);
    }

    public static int setNthBit(int n, int k) {

        return n | (1 << k);
    }

    public static int toggleNthBit(int n, int k) {

        return n ^ (1 << k);
    }

    public static void main(String[] args) {

        System.out.println( unsetNthBit(10, 2));
        System.out.println( setNthBit(10, 2));
        System.out.println( toggleNthBit(10, 2));
    }
}
