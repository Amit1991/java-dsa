package arrays;

import static arrays.ArrayUtils.getIntegerArrayInput;
import static arrays.ArrayUtils.sortIntegerArray;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] firstArray = getIntegerArrayInput();
        int[] secondArray = getIntegerArrayInput();
        int finalArrayLength = firstArray.length + secondArray.length;
        int[] mergedArray = new int[finalArrayLength];
        double median;

        for(int i = 0; i < mergedArray.length; i++) {
            if(i < firstArray.length) {
                mergedArray[i] = firstArray[i];
            } else {
                mergedArray[i] = secondArray[i-firstArray.length];
            }
        }

        mergedArray = sortIntegerArray(mergedArray);
        if(finalArrayLength % 2 == 0) {
            median =  (mergedArray[mergedArray.length / 2] +  mergedArray[mergedArray.length / 2 - 1]) / 2.0;
        } else {
            median =  mergedArray[mergedArray.length / 2];
        }

        System.out.println("Median element of given arrays is: " + median);
    }
}
