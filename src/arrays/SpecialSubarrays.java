package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialSubarrays {

    public static int countSpecialSubarrays(int[] arr) {

        int ans = 0;
        int currentProduct = 1;
        List<Integer> subArrayProducts = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            currentProduct *= arr[i];
            subArrayProducts.add(currentProduct);
        }

        int currentDivisor = arr[0];

        for(int i = 1; i < subArrayProducts.size(); i++, currentDivisor = currentDivisor*arr[i-1]) {
            System.out.println(currentDivisor);
        }


        return ans;
    }

    public static void main(String[] args) {

        countSpecialSubarrays(new int[]{4, 3, 12});
    }
}
