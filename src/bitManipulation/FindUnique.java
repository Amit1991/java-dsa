package bitManipulation;

public class FindUnique {

    public static int findUnique(int[] arr) {
        int result = 0;
        for(int x : arr) {
            result ^= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findUnique(new int[]{2,2,3,3,4,4,5,5,9}));
    }
}
