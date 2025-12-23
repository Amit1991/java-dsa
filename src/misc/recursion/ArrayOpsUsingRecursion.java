package misc.recursion;

import arrays.ArrayUtils;

public class ArrayOpsUsingRecursion {

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

    /**
     * Recursively finds the first index of a target element
     * TC: O(n)
     * SC: O(n)
     */
    public static int firstIndex(int[] arr, int curr, int target) {

        if(arr[curr] == target) return curr;
        if(curr == arr.length -1) return arr[curr] == target ? curr : -1;
        return firstIndex(arr, curr+1, target);
    }

    /**
     * Recursively finds the last index of a target element
     * TC: O(n)
     * SC: O(n)
     */
    public static int lastIndex(int[] arr, int curr, int target) {

        if(arr[curr] == target) return curr;
        if(curr == 0) return arr[curr] == target ? curr : -1;
        return lastIndex(arr, curr-1, target);
    }

    public static void main(String[] args) {

        int[] sampleArr = ArrayUtils.getIntegerArrayInput();
        System.out.println(maxOfArray(sampleArr,0, Integer.MIN_VALUE));
        System.out.println(minOfArray(sampleArr,0, Integer.MAX_VALUE));
        System.out.println(firstIndex(sampleArr, 0, 1));
        System.out.println(lastIndex(sampleArr, sampleArr.length-1, 1));
    }
}
