package arrays;

public class MostWaterContainer {

    public static void main(String[] args) {

        int[] intArr = ArrayUtils.getSampleRandomArray();
        int maxArea = 0, currentArea, distance;

        // Solution with O(n^2) time complexity
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i+1; j < intArr.length; j++) {
                distance = Math.abs(i-j);
                System.out.println(intArr[i] + " @ " + i + " --- " + intArr[j] + " @ " + j + " -- " + distance);

                if(intArr[i] < intArr[j] ) {
                    currentArea = intArr[i] * distance;
                } else {
                    currentArea = intArr[j] * distance;
                }

                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
            }
        }

        // Following solution has O(n) complexity
        intArr = ArrayUtils.getHugeSampleRandomArray();
        int left = 0;
        int right = intArr.length - 1;

        while (left < right) {

            distance = Math.abs(left - right);
            currentArea = intArr[left] < intArr[right] ? intArr[left] * distance : intArr[right] * distance;

            System.out.println(distance + " -- " + intArr[left] + " -- " + left + " -- " + intArr[right] + " -- " + right + " -- " + currentArea);

            if(currentArea > maxArea) {
                maxArea = currentArea;
            }

            if(intArr[left] > intArr[right]) {
                right--;
            } else if (intArr[right] > intArr[left]) {
                left++;
            } else {
                left++;
                right--;
            }
        }

        System.out.println(maxArea);
    }
}
