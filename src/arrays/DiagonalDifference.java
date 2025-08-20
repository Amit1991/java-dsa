package arrays;

import misc.Speed;
import misc.annotations.Done;

import java.util.stream.IntStream;

@Done
public class DiagonalDifference {

    public static int getDiagonalDifference(int[][] arr) {

        int rightDiagonalSum = 0;
        int leftDiagonalSum = 0;

        for(int x = 0; x < arr.length; x++) {
            for(int y = 0; y < arr[x].length; y++) {

                if(x == y) {
                    rightDiagonalSum += arr[x][y];
                }

                if(x + y == arr[x].length-1) {
                    leftDiagonalSum += arr[x][y];
                }
            }
        }

        return Math.abs(rightDiagonalSum - leftDiagonalSum);
    }

    public static int getDiagonalDifferenceFast(int[][] arr) {

        int rightDiagonalSum = 0;
        int leftDiagonalSum = 0;

        for(int x = 0; x < arr.length; x++) {

            rightDiagonalSum += arr[x][x];
            leftDiagonalSum += arr[x][arr[x].length-x-1];
        }

        return Math.abs(rightDiagonalSum - leftDiagonalSum);
    }

    public static int getDiagonalDifferenceFastest(int[][] arr) {

        return Math.abs(IntStream.range(0, arr.length).map(i -> arr[i][i]).sum()
                            - IntStream.range(0, arr.length)
                                .map(i -> arr[i][arr[i].length-i-1]).sum());
    }

    private static int getDiagonalDifference(int[][] randomArray, Speed speed) {

        return switch (speed) {
            case NORMAL ->  getDiagonalDifference(randomArray);
            case FAST ->   getDiagonalDifferenceFast(randomArray);
            case FASTEST ->   getDiagonalDifferenceFastest(randomArray);
            default -> {
                System.out.println("Speed either not specified or not supported.");
                yield -1;
            }
        };
    }

    public static void main(String[] args) {

        for (Speed speed: Speed.getBasicOnes()) {
            System.out.println(getDiagonalDifference(ArrayUtils.getHugeSampleArray(), speed));
        }

        /*
            There is no point calculating the difference of all-right diagonal sum and all-left diagonal sum
            because eventually they are the sum of all elements in the array,
            hence the diff will always be 0.
         */
    }
}
