package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter target sum:");
        int target = Integer.parseInt(in.nextLine());
        System.out.println("Please enter sample array:");
        String arrayString = in.nextLine();
        String[] strArr = arrayString.split(",");
        int[] nums = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            try
            {
                nums[i] = Integer.parseInt(strArr[i]);
            } catch (NumberFormatException e) {
                System.err.println("Try again with an array of integers only.");
            }
        }

        int[] answerArr = new int[2];
        int sum = 0;

        for(int i=0; i < nums.length && sum != target; i++) {
            for(int j=i+1; j < nums.length && sum != target; j++) {

                sum = nums[i] + nums[j];
                System.out.println(i + " -- " + j);

                answerArr[0] = i;
                answerArr[1] = j;

            }
        }

        System.out.println(Arrays.toString(answerArr));
    }
}