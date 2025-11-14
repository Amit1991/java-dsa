package arrays;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] input = {-2,0,1,1,2};
        int sum;
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<input.length; i++) {
            for (int j = i + 1, k = j + 1; j < input.length && k < input.length; j++, k++) {
                //System.out.println(i + " " + j + " " + k);
                System.out.println(input[i] + " " + input[j] + " " + input[k]);
                sum = input[i] + input[j] + input[k];
                if (sum == 0) {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(input[i]);
                    list1.add(input[j]);
                    list1.add(input[k]);
                    Collections.sort(list1);
                    if (!list.contains(list1)) list.add(list1);
                }
            }
        }

        /*
         for(int i=0; i<input.length; i++) {
             for(int j=i+1; j<input.length; j++) {
                 for (int k = j+1; k < input.length; k++) {
                     //System.out.println(input[i] + "/" + input[j] + "/" + input[k]);
                     sum = input[i] + input[j] + input[k];
                     if (sum == 0) {
                         List<Integer> list1 = new ArrayList<>();
                         list1.add(input[i]);
                         list1.add(input[j]);
                         list1.add(input[k]);
                         Collections.sort(list1);
                         if (!list.contains(list1)) list.add(list1);
                     }
                 }
             }
         } */

        System.out.println(list);
    }
}
