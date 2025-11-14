package arrays;

import java.util.List;

public class DifferentialUpdate {

    //TC: O(n*m)
    //SC: O(n)
    public static long arrayManipulation(int n, List<List<Integer>> queries) {

        long[] arr = new long[n];

        int start = 0;
        int end = 0;
        long toAdd = 0l;

        for(List<Integer> internal: queries) {

            start = internal.get(0);
            end = internal.get(1);
            toAdd = 0l + internal.get(2);

            for(int x = start-1; x < end; x++) {
                arr[x] += toAdd;
            }
        }

        long max = 0;

        for(Long x: arr) {

            if(x > max) {
                max = x;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(arrayManipulation(5, List.of(List.of(1,2,100), List.of(2,5,100), List.of(3,4,100))));
    }
}
