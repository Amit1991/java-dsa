package arrays;

import misc.annotations.Done;

/*
    You have a long flowerbed in which some plots are planted, and some are not.
    However, flowers cannot be planted in adjacent plots.
    Given an integer array flowerbed containing 0's and 1's,
    where 0 means empty and 1 means not empty, and an integer n,
    return true if n new flowers can be planted in the flowerbed
    without violating the no-adjacent-flowers rule and false otherwise.
    Original Problem: https://leetcode.com/problems/can-place-flowers/
 */

@Done
public class CanPlaceFlowers {

    //TC: O(n)
    //SC: O(1)
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }

        if (flowerbed.length == 1 && flowerbed[0] == 0 && n <= 1) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {

                if (i == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else if (i == flowerbed.length-1 && flowerbed[i-1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else {
                    if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
        }

        return n <= 0;
    }

    public static void main(String[] args) {

        System.out.println( canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println( canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        System.out.println( canPlaceFlowers(new int[]{0}, 1));
        System.out.println( canPlaceFlowers(new int[]{1}, 1));
        System.out.println( canPlaceFlowers(new int[]{0}, 0));
        System.out.println( canPlaceFlowers(new int[]{1}, 0));
        System.out.println( canPlaceFlowers(new int[]{1,0,0,0,0,0}, 2));
        System.out.println( canPlaceFlowers(new int[]{0,0,0,0,0,0}, 3));
        System.out.println( canPlaceFlowers(new int[]{0,0,1,0,0,}, 2));
    }
}
