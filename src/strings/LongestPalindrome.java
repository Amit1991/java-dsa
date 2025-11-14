package strings;

import misc.annotations.InProgress;

@InProgress
public class LongestPalindrome {

    public static String getLongestPalindrome(String A) {

        int currentMax;
        String maxPalindrome;
        int left;
        int right;
        int adjacent;
        int max;

        if(A == null || A.isEmpty() || A.length() == 1) {
            return A;
        }

        maxPalindrome = A.substring(0, 1);
        max = 1;

        for(int x = 1; x < A.length(); x++) {

            left = x-1;
            right = x+1;

            while(left >= 0 && right < A.length()
                    && A.charAt(left) == A.charAt(right)) {
                left--;
                right++;
            }

            currentMax = right - left - 1;

            if(currentMax > max) {
                max = currentMax;
                maxPalindrome = A.substring(left+1, right);
            }
        }

        right = 0;
        left = 0;

        for(int x = 0; x < A.length(); x++) {

            adjacent = x+1;

            if(adjacent < A.length() && A.charAt(x) == A.charAt(adjacent)) {

                left = x-1;
                right = x+2;

                while(left >= 0 && right < A.length()
                        && A.charAt(left) == A.charAt(right)) {

                    left--;
                    right++;
                }
            }

            currentMax = right - left - 1;

            if(currentMax > max) {
                max = currentMax;
                maxPalindrome = A.substring(left+1, right);
            }
        }

        return maxPalindrome;
    }

    public static void main(String[] args) {
        System.out.printf(getLongestPalindrome("sc"));
    }
}
