package arrays;

import java.util.Arrays;
import java.util.Scanner;

import static arrays.ArrayUtils.getIntegerArrayInput;

public class TwoSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter target sum:");
        int target = Integer.parseInt(in.nextLine());
        int[] nums = getIntegerArrayInput();

        int[] answerArr = new int[2];
        int sum = Integer.MIN_VALUE;

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