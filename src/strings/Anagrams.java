package strings;

import misc.annotations.Done;

import java.util.*;

@Done
public class Anagrams {
    public static int solve(String A, String B) {

        HashMap<Character, Integer> countA = new HashMap<>();
        HashMap<Character, Integer> countB = new HashMap<>();

        if(A.length() != B.length()) return 0;

        for(int x = 0; x < A.length(); x++) {

            countA.put(A.charAt(x), countA.getOrDefault(A.charAt(x), 0) + 1);
            countB.put(B.charAt(x), countB.getOrDefault(B.charAt(x), 0) + 1);
        }

        return countA.equals(countB) ? 1 : 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String A = scanner.nextLine();
        System.out.println("Enter second string: ");
        String B = scanner.nextLine();

        System.out.println(solve(A, B));
    }
}

