package arrays;

import java.util.Scanner;

public class ArrayUtils {

    public static int[] getIntegerArrayInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter array elements separated by spaces:");
        String arrayString = in.nextLine();
        String[] strArr = arrayString.split(" ");
        int[] nums = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            try
            {
                nums[i] = Integer.parseInt(strArr[i]);
            } catch (NumberFormatException e) {
                System.err.println("Try again with an array of integers only.");
            }
        }

        return nums;
    }

    // Time Complexity: O(n^2)
    public static int[] sortIntegerArray(int[] inputArray) {

        int temp;
        for(int j=0; j < inputArray.length; j++) {
            for(int k=j+1; k < inputArray.length; k++) {
                if(inputArray[j] > inputArray[k]) {
                    temp = inputArray[j];
                    inputArray[j] = inputArray[k];
                    inputArray[k] = temp;
                }
            }
        }

        return inputArray;
    }
}
