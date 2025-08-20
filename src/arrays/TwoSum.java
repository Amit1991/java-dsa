package arrays;

import misc.annotations.Done;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static arrays.ArrayUtils.getIntegerArrayInput;

@Done
public class TwoSum {

    //TC: O(n^2)
    //SC: O(1)
    public static int[] getTwoSum(int[] nums, int target) {
        int[] answerArr = new int[2];
        int sum = Integer.MIN_VALUE;

        for(int i=0; i < nums.length && sum != target; i++) {
            for(int j=i+1; j < nums.length && sum != target; j++) {

                sum = nums[i] + nums[j];
                answerArr[0] = i;
                answerArr[1] = j;
            }
        }

        return answerArr;
    }

    //TC: O(n)
    //SC: O(n)
    public static int[] getTwoSumFast(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] answerArr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                answerArr[0] = i;
                answerArr[1] = map.get(complement);
                break;
            }
        }

        return answerArr;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter target sum:");
        int target = Integer.parseInt(in.nextLine());
        int[] nums = getIntegerArrayInput();

        System.out.println(Arrays.toString(getTwoSum(nums, target)));
        System.out.println(Arrays.toString(getTwoSumFast(nums, target)));
    }
}