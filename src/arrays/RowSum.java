package arrays;

import misc.Speed;
import misc.annotations.Done;

import java.util.Arrays;

@Done
public class RowSum {

    public static int[] getRowSum(int[][] arr) {

        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res[i] += arr[i][j];
            }
        }

        return  res;
    }

    public static int[] getRowSumFast(int[][] arr) {

        return Arrays.stream(arr).mapToInt(row -> Arrays.stream(row).sum()).toArray();
    }

    public static int[] getRowSumFaster(int[][] arr) {

        int[] res = new int[arr.length];
        int[] resTemp;

        for (int i = 0; i < arr.length; i++) {

            resTemp = arr[i];

            for (int j = 0; j < resTemp.length; j++) {
                res[i] += resTemp[j];
            }
        }

        return  res;
    }

    public static int[] getRowSumFastest(int[][] arr) {

        return Arrays.stream(arr).parallel()
                .mapToInt(row -> Arrays.stream(row).sum()).toArray();
    }

    public static int[] getRowSum(int[][] arr, Speed speed){

        int[] res = switch (speed) {
            case NORMAL -> getRowSum(arr);
            case FAST -> getRowSumFast(arr);
            case FASTER -> getRowSumFaster(arr);
            case FASTEST -> getRowSumFastest(arr);
            default -> {
                System.out.println("Speed either not specified or not supported.");
                yield null;
            }
        };

        return res;
    }

    public static void main(String[] args) {

        for(Speed speed : Speed.values()) {

            System.out.println(Arrays.toString(getRowSum(ArrayUtils.getRandomArray(), speed)));
        }
    }
}
