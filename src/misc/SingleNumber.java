package misc;

import misc.annotations.InProgress;

@InProgress
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            System.out.println(res + " ---- " + num);
            res = res ^ num;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{1, 1, 3, 5, 5, 7, 3, 9, 9}));
    }
}
