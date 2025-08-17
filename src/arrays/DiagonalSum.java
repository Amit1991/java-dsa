package arrays;

import misc.Speed;
import misc.annotations.Done;

import java.util.Arrays;
import java.util.stream.IntStream;

@Done
public class DiagonalSum {

    //TC: O(n*m)
    //SC: O(1)
    public static int getMainDiagonalSum(int[][] arr) {

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(i == j) {
                    ans = ans + arr[i][j];
                }
            }
        }

        return ans;
    }

    //TC: O(n)
    //SC: O(1)
    public static int getMainDiagonalSumFast(int[][] arr) {

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = ans + arr[i][i];
        }

        return ans;
    }

    //TC: O(n)
    //SC: O(1)
    public static int getMainDiagonalSumFastest(int[][] arr) {

        return IntStream.range(0, arr.length).map(i -> arr[i][i]).sum();
    }

    //TC: O(n*m)
    //SC: O(n+m)
    public static int[] getAllRightDiagonalSum(int[][] arr){

        //2D array of n*m size has n+m-1 diagonals
        int[] sum = new int[arr.length + arr[0].length - 1];

        for(int i=0; i < arr.length; i++){
            for(int x=0; x < arr[0].length; x++){

                //from top-right to the bottom-left
                sum[i-x+arr[0].length-1] += arr[i][x];
                //from bottom-left to top-right
                //sum[i-x+arr[0].length-1] += arr[x][i];
            }
        }

        return sum;
    }

    //TC: O(n*m)
    //SC: O(n+m)
    public static int[] getAllLeftDiagonalSum(int[][] arr){

        //2D array of n*m size has n+m-1 diagonals
        int[] sum = new int[arr.length + arr[0].length - 1];

        for(int i=arr.length-1; i >= 0; i--){

            for(int x=arr[0].length-1; x >= 0; x--){

                sum[i+x] += arr[i][x];
            }
        }

        return sum;
    }

    public static int getMainDiagonalSum(int[][] arr, Speed speed){

        return switch (speed) {
            case NORMAL -> getMainDiagonalSum(arr);
            case FAST -> getMainDiagonalSumFast(arr);
            case FASTEST -> getMainDiagonalSumFastest(arr);
            default -> {
                System.out.println("Speed either not specified or not supported.");
                yield -1;
            }
        };
    }

    public static void main(String[] args) {

        for (Speed speed : Speed.getBasicOnes()) {
            System.out.println(getMainDiagonalSum(ArrayUtils.getHugeSampleArray(), speed));
        }

        System.out.println(Arrays.toString(getAllRightDiagonalSum(ArrayUtils.getRandomArray())));

        System.out.println(Arrays.toString(getAllLeftDiagonalSum(ArrayUtils.getRandomArray())));
    }
}
