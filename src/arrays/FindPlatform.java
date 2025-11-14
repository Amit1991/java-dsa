package arrays;

public class FindPlatform {

    static int findPlatform(int arr[], int dep[]) {
        // add your code here

        int countOfPlatforms = 1;

        for(int x = 1; x < arr.length; x++) {

            if(arr[x] <= dep[x-1]) {

                countOfPlatforms++;
            } else {
                if (countOfPlatforms > 1) countOfPlatforms--;
            }
        }

        return countOfPlatforms;
    }

    public static void main(String[] args) {

        System.out.println(findPlatform(new int[]{900, 940, 950, 1100, 1500, 1800}, new int[]{910, 1200, 1120, 1130, 1900, 2000}));
    }
}
