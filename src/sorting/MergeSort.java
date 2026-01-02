package sorting;

import arrays.ArrayUtils;

import java.util.Arrays;

public class MergeSort {

    /**
     * Merges two sorted arrays into one single sorted array
     */
    public static int[] mergeSortedArrays(int[] A, int[] B) {

        int[] result = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        while(i < A.length && j < B.length) {

            if(A[i] <= B[j]) {
                result[k] = A[i];
                i++;
            } else {
                result[k] = B[j];
                j++;
            }

            k++;
        }

        while(i < A.length) {

            result[k] = A[i];
            i++;
            k++;
        }

        while(j < B.length) {

            result[k] = A[j];
            j++;
            k++;
        }

        return result;
    }

    /**
     * Merges two sorted subarrays into a single array
     */
    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = Arrays.copyOfRange(arr, left, mid+1);
        int[] R = Arrays.copyOfRange(arr, mid+1, right+1);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Recursively sorts a given array via divide and conquer
     * Merge Sort implementation
     * TC: O(nlogn)
     * SC: O(n)
     */
    private static int[] mergeSort(int[] arr, int start, int end) {

        if(start >= end) return arr;
        int mid = (end + start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);

        return arr;
    }

    public static void main(String[] args) {

        int[] A = {1, 3, 5, 8};
        int[] B = {2, 4, 6, 7};

        System.out.println(Arrays.toString(mergeSortedArrays(A, B)));

        int[] sampleArr = ArrayUtils.getSampleRandomArray();
        System.out.println(Arrays.toString(mergeSort(sampleArr, 0, sampleArr.length-1) ));
    }
}
