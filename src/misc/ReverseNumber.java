package misc;

import misc.annotations.Done;

@Done
public class ReverseNumber {

    // Time complexity: O(n) where n is the number of digits in the number
    public static int reverseNumber(int number) {
        
        int result = 0;
        int currentDigit;

        int lastDigit = number % 10;
        int firstDigit = number / 10;
        
        while(number != 0) {
            
            currentDigit = number % 10;
            number = number / 10;
            
            result = (result * 10) + currentDigit;

            firstDigit = currentDigit;
        }

        if(result / 10 != lastDigit && result % 10 != firstDigit) {

            result = 0;
        }

        return result;
    }
    
    public static void main(String[] args) {

        System.out.println(reverseNumber(6152));
        System.out.println(reverseNumber(Integer.MAX_VALUE));
        System.out.println(reverseNumber(Integer.MIN_VALUE));
        System.out.println(reverseNumber(-123456789));
        System.out.println(reverseNumber(100));
    }
}
