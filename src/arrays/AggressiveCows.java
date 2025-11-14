package arrays;

public class AggressiveCows {

    public static int minDistanceToAdjustCows(int[] barn, int numberOfCows) {

        int midDistance = Integer.MAX_VALUE;
        int l = 0;
        int totalDistance = barn[barn.length - 1] - barn[0];
        int result = 0;

        while(l <= totalDistance) {

            midDistance = (totalDistance - l) / 2 + l;

            if(cowsCanFitInGivenDistance(barn, midDistance) >= numberOfCows) {
                l = midDistance + 1;
                result = midDistance;
            } else {
                totalDistance = midDistance - 1;
            }

            System.out.println(result + " " + l + " " + totalDistance + " " + midDistance);
        }

        return result;
    }

    public static int cowsCanFitInGivenDistance(int[] barn, int distance) {

        int cows = 1;
        int lastCowAt = barn[0];

        for(int i = 1; i < barn.length; i++) {

            if(barn[i] - lastCowAt >= distance) {
                cows++;
                lastCowAt = barn[i];
            }
        }

        return cows;
    }

    public static void main(String[] args) {
        System.out.println(cowsCanFitInGivenDistance(new int[]{0, 3, 4, 7, 9, 10}, 3));
        System.out.println(minDistanceToAdjustCows(new int[]{0, 3, 4, 7, 9, 10}, 4));
    }
}
