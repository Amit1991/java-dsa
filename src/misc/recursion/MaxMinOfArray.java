package misc.recursion;

import arrays.ArrayUtils;

public class MaxMinOfArray {

    /**
    * Recursively finds the maximum element in an integer array.
    * TC: O(n)
    * SC: O(n)
    */
    public static int maxOfArray(int[] arr, int curr, int max) {

        if(curr == arr.length) return max;
        return maxOfArray(arr, curr+1, Math.max(arr[curr], max));
    }

    /**
     * Recursively finds the minimum element in an integer array.
     * TC: O(n)
     * SC: O(n)
     */
    public static int minOfArray(int[] arr, int curr, int min) {

        if(curr == arr.length) return min;
        return minOfArray(arr, curr+1, Math.min(arr[curr], min));
    }

    public static void main(String[] args) {

        int[] sampleArr = ArrayUtils.getIntegerArrayInput();
        System.out.println(maxOfArray(sampleArr,0, Integer.MIN_VALUE));
        System.out.println(minOfArray(sampleArr,0, Integer.MAX_VALUE));
    }
}
