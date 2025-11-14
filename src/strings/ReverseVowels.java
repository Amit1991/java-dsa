package strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {

    public static String reverseVowels(String s) {

        char[] charArr = s.toCharArray();
        List<Character> vowels = List.of(
                'a','e','i','o','u',
                'A','E','I','O','U'
        );

        List<Integer> vi = new ArrayList<>();

        for(int x = 0; x < charArr.length; x++) {

            if(vowels.contains(charArr[x])) {
                vi.add(x);
            }
        }

        StringBuilder sb = new StringBuilder(s);
        char charAtEnd = '-';
        char charAtStart = '-';

        for(int x = 0; vi.size() > 0 && x <= vi.size() / 2; x++) {

            charAtStart = s.charAt(vi.get(x));
            charAtEnd = s.charAt(vi.get(vi.size()-x-1));

            sb.setCharAt(vi.get(x), charAtEnd);
            sb.setCharAt(vi.get(vi.size()-x-1), charAtStart);
        }

        return sb.toString();
    }

    public static String reverseVowelsFast(String s) {

        char[] charArr = s.toCharArray();
        List<Character> vowels = List.of(
                'a','e','i','o','u',
                'A','E','I','O','U'
        );

        int start = 0;
        int end = charArr.length-1;

        while(start < end) {

            if(start < end && !vowels.contains(charArr[start])) {
                start++;
            }

            if(start < end && !vowels.contains(charArr[end])) {
                end--;
            }

            if(start < end) {
                char temp = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = temp;
                start++;
                end--;
            }
        }

        return new String(charArr);
    }

    public static void main(String[] args) {

        System.out.println(reverseVowels(",."));
        System.out.println(reverseVowelsFast("leetcode"));
    }
}
