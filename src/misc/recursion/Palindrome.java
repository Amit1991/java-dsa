package misc.recursion;

public class Palindrome {

    /**
     * Recursively determines whether the string is a palindrome
     * TC: O(n)
     * SC: O(n)
     */
    private static boolean isPalindrome(String str) {

        if(str.length() <= 1) return true;
        if(str.charAt(0) != str.charAt(str.length()-1)) return false;
        return isPalindrome(str.substring(1, str.length()-1));
    }

    /**
     * Iteratively validates string is a palindrome
     * TC: O(n)
     * SC: O(1)
     */
    private static boolean isPalindromeIterative(String str) {

        if(str.length() <= 1) return true;
        if(str.charAt(0) != str.charAt(str.length()-1)) return false;

        for(int i = 1; i < str.length()/2; i++) {

            if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String[] testStrings = {
                "racecar",
                "hello",
                "madam",
                "step on no pets",
                "java"
        };

        for(String testString : testStrings) {

            System.out.println("1. " + isPalindrome(testString));
            System.out.println("2. " + isPalindromeIterative(testString));
            System.out.println("---------------------------");
        }
    }
}
