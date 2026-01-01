package sorting;

import arrays.ArrayUtils;

import java.util.Arrays;

public class CountSort {

    /**
     * Computes the smallest number from digits of input
     * TC: O(n)
     * SC: O(1)
     */
    public static int smallestNumber(int num) {

        int[] freqArr = new int[10];
        while(num > 0) {

            freqArr[num % 10]++;
            num /= 10;
        }

        StringBuilder ansNumStr = new StringBuilder();

        for (int i = 1; i < freqArr.length; i++) {

            ansNumStr.append(String.valueOf(i).repeat(Math.max(0, freqArr[i])));
        }

        return Integer.parseInt(ansNumStr.toString());
    }

    /**
     * Sorts an input array using frequency counting
     * TC: O(n+k)
     * SC: O(n+k)
     */
    public static int[] countSort(int[] arr) {

        int max = Arrays.stream(arr).max().isPresent() ? Arrays.stream(arr).max().getAsInt() : 0;
        int[] freqArr = new int[max+1];

        for (int i : arr) freqArr[i]++;

        System.out.println(Arrays.toString(freqArr));

        for (int i = 0, currIndex = 0; i < freqArr.length; i++) {

            for (int j = 0; j < freqArr[i]; j++) {

                arr[currIndex++] = i;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(smallestNumber(772319842));
        System.out.println(Arrays.toString(countSort(ArrayUtils.getHugeSampleRandomArray())));
    }
}
