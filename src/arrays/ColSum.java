package arrays;

import misc.annotations.Done;

import java.util.Arrays;

@Done
public class ColSum {

    public static int[] getColSum(int[][] arr) {

        int[] res = new int[arr[0].length];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                res[i] += arr[j][i];
            }
        }

        return  res;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getColSum(ArrayUtils.getRandomArray())));
    }
}
