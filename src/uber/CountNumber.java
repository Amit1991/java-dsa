package uber;

import arrays.ArrayUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountNumber {

    private static int countNumberWithHashMap(int[] givenArr, int number) {

        int count = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < givenArr.length; i++) {

            if (map.containsKey(givenArr[i])) {
                map.put(givenArr[i], map.get(givenArr[i]) + 1);
            } else {
                map.put(givenArr[i], 1);
            }
        }

        System.out.println(map);

        return number;
    }

    public static void main(String[] args) {
        System.out.println(countNumberWithHashMap(ArrayUtils.getHugeSampleRandomArray(), 9));
    }
}
